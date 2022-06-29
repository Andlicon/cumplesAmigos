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


// INVESTIGAR CÓMO HACER QUE ESTO QUE YO CONSIDERO QUE ESTÁ BIEN LINDO, FUNCIONE
// CON ESO ME REFERIA A INVESTIGAR CÓMO FUNCIONAN LAS INTERFACES GENÉRICAS Y SU IMPLEMENTACIÓN EN CLASES QUE LA IMPLEMENTS