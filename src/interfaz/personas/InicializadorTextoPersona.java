package interfaz.personas;

import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Inicializador de JTextField para el PanelPersona
 * 
 * @author Andlicon
 * 
 * @param <T> es la accion a anadir en el JTextField
 */
public class InicializadorTextoPersona<T extends KeyListener> {
		//ATRIBUTOS
	/**
	 * JPanel al que se anadiran los textos
	 */
	private JPanel panel;
	
	
		//CONSTRUCTOR
	/**
	 * Unico constructor
	 * 
	 * @param panel panel al anadir JTextFields 
	 */
	public InicializadorTextoPersona(JPanel panel) {
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
