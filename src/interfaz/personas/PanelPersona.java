package interfaz.personas;

import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import acciones.texto.AccionLimitarTexto;
import acciones.texto.LimitarFecha;
import acciones.texto.LimitarNombres;
import conexion.IAlmacenador;
import personas.PersonaData;

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
	/**
	 * Boton enviar
	 */
	private JButton botonEnviar;
	/**
	 * Boton borrar
	 */
	private JButton botonBorrar;
	/**
	 * Conexion a base de dato
	 */
	private IAlmacenador almacenador;
	
	
		//CONSTRUCTORE
	/**
	 * Constructor por defecto
	 */
	public PanelPersona(IAlmacenador almacenador) {
		//Asignando valores del constructor
		this.almacenador = almacenador;
		
		//inicializar textFields
		InicializadorTextoPersona<AccionLimitarTexto> iniText = new InicializadorTextoPersona<AccionLimitarTexto>(this);
		textoNombre = iniText.inicializarTextField(textoNombre, new LimitarNombres(60), 30);
		textoApellido = iniText.inicializarTextField(textoApellido, new LimitarNombres(60), 30);
		textoFecha = iniText.inicializarTextField(textoFecha, new LimitarFecha(LimitarFecha.YYYY_MM_DD, '-'), 10);
		
		//inicializar labels
		InicializadorLabel iniLabel = new InicializadorLabel(this);
		labelNombre = iniLabel.inicializarLabel(labelNombre, "Nombre de la persona: ");
		labelApellido = iniLabel.inicializarLabel(labelApellido, "Apellido de la persona: ");
		labelFecha = iniLabel.inicializarLabel(labelFecha, "Fecha de nacimiento YYYY-MM-DD: ");
		
		//inicializando botones
		botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					almacenador.guardar(new PersonaData(textoNombre.getText(), textoApellido.getText(), Date.valueOf(textoFecha.getText())));
				}
				catch (IllegalArgumentException exception) {
					JOptionPane.showMessageDialog(null, "NO se ha anadido la persona con exito.");
				}
			}
		});
		
		botonBorrar = new JButton("Borrar");
		
		//crearDisplay
		disenarDisplay();
	}
	
	
		//Metodos
	/**
	 * inicializa el display
	 */
	private void disenarDisplay() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Box cajaNombre = new Box(BoxLayout.X_AXIS);
		cajaNombre.add(labelNombre);
		cajaNombre.add(textoNombre);
		this.add(cajaNombre);

		Box cajaApellido = new Box(BoxLayout.X_AXIS);
		cajaApellido.add(labelApellido);
		cajaApellido.add(textoApellido);
		this.add(cajaApellido);
		
		Box cajaFecha = new Box(BoxLayout.X_AXIS);
		cajaFecha.add(labelFecha);
		cajaFecha.add(textoFecha);
		this.add(cajaFecha);
		
		Box cajaBotones = new Box(BoxLayout.X_AXIS);
		cajaBotones.add(botonEnviar);
		cajaBotones.add(botonBorrar);
		this.add(cajaBotones);
	}
}
