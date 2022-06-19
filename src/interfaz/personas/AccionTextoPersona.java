package interfaz.personas;

import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class AccionTextoPersona<T extends KeyListener> {
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
	public void inicializarTextField(JTextField textField, T accionGenerica, int longitud) {
		textField = new JTextField(longitud);
		textField.addKeyListener(accionGenerica);		
		panel.add(textField);
	}
}
