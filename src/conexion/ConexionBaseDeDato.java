package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDato implements ConexionAlmacenaje {
		//ATRIBUTOS
	/**
	 * Ruta de la base de dato
	 */
	private String ruta;
	/**
	 * Usuario de la base de dato
	 */
	private String usuario;
	/**
	 * Contrasena del usuario
	 */
	private String contrasena;
	/**
	 * Conexion a la base de dato
	 */
	private Connection conexion;
	
	
		//CONSTRUCTORES
	/**
	 * Unico constructor
	 * 
	 * @param ruta			Ruta de la base de dato
	 * @param usuario		Usuario de la base de dato
	 * @param contrasena	Contrasena del usuario
	 */
	public ConexionBaseDeDato(String ruta, String usuario, String contrasena) {
		this.ruta = ruta;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	
		//METODOS
	@Override
	public Connection conectar() {
		conexion = null;
		
		try {
			conexion = DriverManager.getConnection(ruta, usuario, contrasena);
		} 
		catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	@Override
	public void desconectar() {
		try {
			conexion.close();
		}
		catch (SQLException e) {
			System.out.println("No se pudo cerrar la conexion a la base de datos");
			e.printStackTrace();
		}
	}


		//GETTERS y SETTERS
	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}
