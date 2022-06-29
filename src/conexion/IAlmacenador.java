package conexion;

import java.io.Serializable;

/**
 * Almacena y extrae informacion de cualquier fuente de almacenaje
 * 
 * @author usuario
 */
public interface IAlmacenador <T extends Serializable> {
		// ATRIBUTOS
	/**
	 * Guarda la informacion
	 */
	public abstract boolean guardar(T objeto) throws IllegalArgumentException;
	/**
	 * Extrae la informacion
	 */
	public abstract T extraerPorIndice(int indice);
	/**
	 * 
	 */
	public abstract T consultar();
}


// INVESTIGAR C�MO HACER QUE ESTO QUE YO CONSIDERO QUE EST� BIEN LINDO, FUNCIONE
// CON ESO ME REFERIA A INVESTIGAR C�MO FUNCIONAN LAS INTERFACES GEN�RICAS Y SU IMPLEMENTACI�N EN CLASES QUE LA IMPLEMENTS