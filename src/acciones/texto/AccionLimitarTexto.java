package acciones.texto;

import java.awt.event.KeyAdapter;

import javax.swing.text.JTextComponent;

/**
 * Comprobar si un JTextField es valido para subirlo a la bdd
 * 
 * SOLO ES VALIDO PARA JTEXTFIELD
 * 
 * @author Andlicon
 */
public abstract class AccionLimitarTexto extends KeyAdapter {
		//ATRIBUTOS
	/**
	 * limite de caracteres que el texto debe tener
	 */
	private int limite_caracteres;
	
	
		//CONSTRUCTORES
	/**
	 * Es un evento para limitar el texto que es introducido, tanto en terminos
	 * de longitud, como en terminos de caracteres
	 * 
	 * @param limite_caracteres
	 */
	public AccionLimitarTexto(int limite_caracteres) {
		this.limite_caracteres = limite_caracteres;
	}
	
	
		//METODOS
	/**
	 * Comprueba si un caracter intorducido es valido, acorde a cierta condicion
	 * 
	 * @param caracter caracter a comprobar
	 * @return validez del caracter
	 */
	protected abstract boolean isCaracterValido(char caracter);
	
	/**
	 * Comprueba si la longitud del texto es valida
	 * @return validez de longitud
	 */
	protected boolean isLimiteValido(JTextComponent texto) {
		return texto.getText().length() >= limite_caracteres ? false : true;
	}


	/**
	 * @return the limite_caracteres
	 */
	public int getLimite_caracteres() {
		return limite_caracteres;
	}

}
