package interfaz.personas;

import javax.swing.JPanel;
import javax.swing.JTextField;

import acciones.texto.AccionLimitarTexto;
import acciones.texto.LimitarNombres;

public class AccionTextoPersona {
		//ATRIBUTOS
	private JPanel panel;
	
	
		//CONSTRUCTOR
	public AccionTextoPersona(JPanel panel) {
		this.panel = panel;
	}
	
	
		//METODOS
	/**
	 * Inicializa el textField
	 * 
	 * @param textField	textfield
	 * @param longitud	longitud
	 */
	public void inicializarTextField(JTextField textField, int longitud) {
		textField = new JTextField(longitud/3);
		textField.addKeyListener(new LimitarNombres(10));		
		panel.add(textField);
	}
}
