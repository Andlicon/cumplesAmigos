package personas;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que sirve para almacenar la informacion basica de una persona 
 *  
 * @author Andlicon
 *
 */
public class PersonaData implements Serializable {
		// ATRIBUTOS DE CLASE
	/**
	 *  serializable version
	 */
	private static final long serialVersionUID = 1L;
	
	
		// ATRIBUTOS
	/**
	 * Nombre
	 */
	private String nombre;
	/**
	 * Apellido
	 */
	private String apellido;
	/**
	 * Fecha de cuando nacio
	 */
	private Date fecha_nacimiento;
	/**
	 * Edad de la persona
	 */
	private int edad;
	
	
		// CONSTRUCTORES
	/**
	 * Constructor completo, permite crear una persona asignando nombre, apellido y fecha de nacimiento.
	 * 
	 * @param nombre 			nombre
	 * @param apellido 			apellido
	 * @param fecha_nacimiento 	fecha de nacimiento
	 */
	public PersonaData(String nombre, String apellido, Date fecha_nacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	/**
	 * Constructor mas basico
	 * 
	 * @param nombre	nombre
	 * @param apellido	apellido
	 */
	public PersonaData(String nombre, String apellido) {
		this(nombre, apellido, null);
	}
	
	/**
	 * Constructor para satisfacer las condiciones de Serializable
	 */
	public PersonaData() {}

	
		// SETTERS y GETTERS
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fecha_nacimiento
	 */
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
