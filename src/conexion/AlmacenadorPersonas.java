package conexion;

import java.sql.*;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import personas.PersonaData;
/**
 * Implementacion especifica para anadir o extraer personas a la base de datos
 * 
 * @author Andlicon
 */
public class AlmacenadorPersonas implements IAlmacenador<PersonaData>{
		//ATRIBUTOS
	private ConexionBaseDeDato bdd;
	
	public AlmacenadorPersonas() {	
		bdd = new ConexionBaseDeDato("jdbc:mysql://127.0.0.1:3306/amigos", "root", "admin");
	}

	@Override
	public PersonaData extraerPorIndice(int indice) {
		Connection conexion = bdd.conectar();
		PersonaData persona = null;
		
		try {
			String sql = "SELECT * FROM personas WHERE id=?;";
			PreparedStatement statement = conexion.prepareStatement(sql);
			statement.setInt(1, indice);
			
			ResultSet resultado = statement.executeQuery();
			
			if(resultado.next()) {
				persona = new PersonaData(resultado.getString("nombres"), resultado.getString("apellidos"), resultado.getDate("fecha_nacimiento"));
			}
		}
		catch (SQLException e) {
			System.out.println("No se pudo extraer la persona por el indice indicado");
			e.printStackTrace();
		}
		
		bdd.desconectar();
		
		return persona;
	}

	@Override
	public boolean guardar(PersonaData persona) throws IllegalArgumentException {
		Connection conexion = bdd.conectar();
		boolean exito = false;
		
		try {		//Escribir en la BDD la info de la persona
			String sql = "INSERT INTO personas (nombres, apellidos, fecha_nacimiento)"
					   + "VALUES (?, ?, ?)";
			
			PreparedStatement statement = conexion.prepareStatement(sql);
			statement.setString(1, persona.getNombre());
			statement.setString(2, persona.getApellido());
			java.util.Date fecha = persona.getFecha_nacimiento();
			statement.setDate(3, java.sql.Date.valueOf(fecha.toString()));
			statement.executeUpdate();
			exito = true;
		} 
		catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Error al insertar persona, se ha violado las restricciones de la Base de Datos.");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Error al insertar las personas.");
			e.printStackTrace();
		}
		finally {		//cerrar la conexion a la BDD
			bdd.desconectar();
		}
		
		return exito;
	}

	@Override
	public PersonaData consultar() {
		// TODO Auto-generated method stub
		return null;
	}

}
