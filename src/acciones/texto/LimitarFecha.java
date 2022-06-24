package acciones.texto;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import interfaz.personas.FormatoFecha;

/**
 * Limita los JTextField para fechas.
 * Este es el formato "DD-MM-YYYY"
 * 
 * @author Andlicon
 */
public class LimitarFecha extends AccionLimitarTexto {
		//CONSTANTES
	public static int YYYY_MM_DD = 1;
		//ATRIBUTOS
	/**
	 * Caracter separador
	 */
	private FormatoFecha formato;
	private char separador;
	
		//CONSTRUCTOR
	/**
	 * Crea las fechas
	 */
	public LimitarFecha(int form_fecha, char separador) {
		super(10);
		
		if(form_fecha == LimitarFecha.YYYY_MM_DD) {
			this.formato = FormatoFecha.YYYYMMDD;
		}
		
		this.separador = separador;
	}

	
		//METODOS
	
		//IMPLEMENTACIONES
	@Override
	public void keyTyped(KeyEvent e) {
		super.keyTyped(e);
	}
	
	@Override
	protected boolean isCaracterValido(char caracter) {
		if(Character.isDigit(caracter) || caracter == this.separador) {
			return true;
		}
		return false;
	}

	/**
	 * Comprueba que una cadena representa una fecha bajo cierto formato
	 * 
	 * @param fecha cadena fecha
	 * @return
	 */
	public boolean cumpleFormato(String fecha) {
		return fecha.matches(this.formato.getRegex());
	}
}
