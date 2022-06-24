package acciones.texto;

/**
 * Limita los JTerxtField de forma que solo permite introducir letras
 * 
 * @author Andlicon
 */
public class LimitarNombres extends AccionLimitarTexto {
		//CONSTRUCTORES
	/**
	 * Limita los textos
	 * @param limite_caracteres limite
	 */
	public LimitarNombres(int limite_caracteres) {
		super(limite_caracteres);
	}

	
		//IMPLEMENTACIONES
	@Override
	protected boolean isCaracterValido(char caracter) {
		return Character.isLetter(caracter) || Character.isSpaceChar(caracter);
	}

}
