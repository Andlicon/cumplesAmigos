package interfaz.personas;

import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import acciones.texto.AccionLimitarTexto;
import acciones.texto.LimitarFecha;
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
		//inicializar textFields
		InicializadorTextoPersona<AccionLimitarTexto> iniText = new InicializadorTextoPersona<AccionLimitarTexto>(this);
		textoNombre = iniText.inicializarTextField(textoNombre, new LimitarNombres(60), 30);
		textoApellido = iniText.inicializarTextField(textoApellido, new LimitarNombres(60), 30);
		textoFecha = iniText.inicializarTextField(textoFecha, new LimitarFecha(LimitarFecha.YYYY_MM_DD, '-'), 10);
		
		//inicializar labels
		InicializadorLabel iniLabel = new InicializadorLabel(this);
		labelNombre = iniLabel.inicializarLabel(labelNombre, "Nombre de la persona: ");
		labelApellido = iniLabel.inicializarLabel(labelApellido, "Apellido de la persona: ");
		labelFecha = iniLabel.inicializarLabel(labelFecha, "Fecha de la persona: ");
		
		//crearDisplay
		disenarDisplay();
	}
	
	
		//Metodos
	
	/**
	 * inicializa el display
	 */
	private void disenarDisplay() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// IBA A CREAR LOS BOXES DONDE ANADIRE ESTO PARA QUE QUEDE BONITO
		// QUIERO QUE QUEDE ASI:
		/**
		 * 	LABEL --- JTEXTFIELD
		 *  LABEL --- JTEXTFIELD
		 *  LABEL --- JTEXTFIELD
		 *     BOTON BOTON
		 */
		
		//Anadiendo componentes, haciendo el diseno
		this.add(labelNombre);
		this.add(textoNombre);
		this.add(labelApellido);
		this.add(textoApellido);
		this.add(labelFecha);
		this.add(textoFecha);
		this.add(new JButton("Guardar"));
		this.add(new JButton("Borrar"));
	}
}
