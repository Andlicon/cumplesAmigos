package conexion;

import java.sql.Connection;

/**
 * Conexion a algun componente de almacenaje
 * 
 * @author Andlicon
 */
public interface ConexionAlmacenaje {
	/**
	 * Conectar
	 * 
	 * @return conexion
	 */
	public abstract Connection conectar();
	/**
	 * Deconecta de la conexion.
	 */
	public abstract void desconectar();
}
