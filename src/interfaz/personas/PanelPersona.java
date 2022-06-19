package interfaz.personas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPersona extends JPanel {
		//ATRIBUTOS
	//textos de donde se extraera la info
	/**
	 * texto donde el usuario introducira el nombre
	 */
	private JTextField textoNombre;
	/**
	 * texto donde el usuario intorducira el apellido
	 */
	private JTextField textoApellido;
	/**
	 * Buscar la clase que sirve para esto, se que existe una
	 */
	private JTextField textoFecha;
	
	//label donde se le indicara al usuario la info a introducir
	/**
	 * label para solicitar nombre
	 */
	private JLabel labelNombre;
	/**
	 * label para solicitar apellido
	 */
	private JLabel labelApellido;
	/**
	 * label para solicitar fecha
	 */
	private JLabel labelFecha;
	
	
		//CONSTRUCTORE
	public PanelPersona() {
		//inicializar textFields
		AccionTextoPersona accionTexto = new AccionTextoPersona(this);
		accionTexto.inicializarTextField(textoNombre, 60);
		accionTexto.inicializarTextField(textoApellido, 60);
		
		//inicializar labels
		inicializarLabel(labelNombre, "");
		inicializarLabel(labelApellido, "");
		inicializarLabel(labelFecha, "");
		
		//crearDisplay
		disenarDisplay();
	}
	
	
		//Metodos
	/**
	 * inicializa los text fields
	 * 
	 * @param textField textField
	 * @param longitud longitud maxima del textField
	 */
	private void inicializarTextField(JTextField textField, int longitud) {
		textField = new JTextField(longitud);
		
		this.add(textField);
	}
	
	/**
	 * inicializa los label
	 * 
	 * @param label
	 */
	private void inicializarLabel(JLabel label, String texto) {
		label = new JLabel(texto);
		this.add(label);
	}
	
	/**
	 * inicializa el display
	 */
	private void disenarDisplay() {
		
	}
}
