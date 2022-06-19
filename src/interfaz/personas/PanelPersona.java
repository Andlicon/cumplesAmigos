package interfaz.personas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import acciones.texto.LimitarNombres;

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
	/**
	 * Constructor por defecto
	 */
	public PanelPersona() {
		//crearDisplay
		disenarDisplay();
				
		//inicializar textFields
		AccionTextoPersona<LimitarNombres> accionTexto = new AccionTextoPersona<LimitarNombres>(this);
		accionTexto.inicializarTextField(textoNombre, new LimitarNombres(60), 30);
		accionTexto.inicializarTextField(textoApellido, new LimitarNombres(60), 30);
		
		//inicializar labels
		inicializarLabel(labelNombre, "");
		inicializarLabel(labelApellido, "");
		inicializarLabel(labelFecha, "");
	}
	
	
		//Metodos
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
