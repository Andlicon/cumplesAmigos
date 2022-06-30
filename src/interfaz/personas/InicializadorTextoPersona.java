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
public abstract class InicializadorTextoPersona {

		//METODOS
	/**
	 * Inicializa el textField
	 * 
	 * @param textField	textfield
	 * @param longitud	longitud longitud del cuadro visual que abarca el JTextField
	 */
	public static <T extends KeyListener> JTextField inicializarTextField(JTextField textField, T accionGenerica, int longitud) {
		textField = new JTextField(longitud);
		textField.addKeyListener(accionGenerica);
		
		return textField;
	}
}
