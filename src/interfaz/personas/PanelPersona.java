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
		InicializadorTextoPersona<LimitarNombres> iniText = new InicializadorTextoPersona<LimitarNombres>(this);
		iniText.inicializarTextField(textoNombre, new LimitarNombres(60), 30);
		iniText.inicializarTextField(textoApellido, new LimitarNombres(60), 30);
		
		//inicializar labels
		InicializadorLabel iniLabel = new InicializadorLabel(this);
		iniLabel.inicializarLabel(labelNombre, "Nombre de la persona: ");
		iniLabel.inicializarLabel(labelApellido, "Apellido de la persona: ");
		iniLabel.inicializarLabel(labelFecha, "Fecha de la persona: ");
	}
	
	
		//Metodos
	
	/**
	 * inicializa el display
	 */
	private void disenarDisplay() {
		
	}
}
