package interfaz.prefabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import acciones.texto.LimitarFecha;
import acciones.texto.LimitarNombres;
import conexion.AlmacenadorPersonas;
import conexion.IAlmacenador;
import interfaz.personas.InicializadorLabel;
import interfaz.personas.InicializadorTextoPersona;
import personas.PersonaData;

public class CreadorPanelPersona extends CreadorPanelInputInfo {
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
	private JButton botonCargar;
	/**
	 * Conexion a base de dato
	 */
	private IAlmacenador<PersonaData> almacenador;
	
	private Hashtable<JLabel, JTextField> diccionario;
	
	
		//CONSTRUCTOOR
	public CreadorPanelPersona() {
			//inicializando atributos
		almacenador = new AlmacenadorPersonas();
		
			//Inicializando JTextFields
		textoNombre = InicializadorTextoPersona.inicializarTextField(textoNombre, new LimitarNombres(60), 30);
		textoApellido = InicializadorTextoPersona.inicializarTextField(textoApellido, new LimitarNombres(60), 30);
		textoFecha = InicializadorTextoPersona.inicializarTextField(textoFecha, new LimitarFecha(LimitarFecha.YYYY_MM_DD, '-'), 10);
		
			//Inicializando JLabels
		labelNombre = InicializadorLabel.inicializarLabel(labelNombre, "Nombre de la persona: ");
		labelApellido = InicializadorLabel.inicializarLabel(labelApellido, "Apellido de la persona: ");
		labelFecha = InicializadorLabel.inicializarLabel(labelFecha, "Fecha de nacimiento YYYY-MM-DD: ");
		
			//inicializando diccionario
		inicializarDiccionario();
		
			//inicializando boton
		inicializarBotonCargar();
	}
	
	private void inicializarDiccionario() {
		this.diccionario = new Hashtable<JLabel, JTextField>();
		diccionario.put(labelNombre, textoNombre);
		diccionario.put(labelApellido, textoApellido);
		diccionario.put(labelFecha, textoFecha);
	}

	@Override
	public JPanel getPanel() {
		return new PanelAlmacenar<PersonaData>(new AlmacenadorPersonas(), diccionario, botonCargar);
	}
	
	@Override
	protected void inicializarBotonCargar() {
		botonCargar = new JButton("Cargar");
		botonCargar.addActionListener(new ActionListener() {
			
			@Override		//Cargar a la base de datos
			public void actionPerformed(ActionEvent e) {
				try {
						//extrayendo info de los JTextFields
					String nombrePersona = textoNombre.getText();
					String apellidoPersona = textoApellido.getText();
					Date nacimientoPersona = Date.valueOf(textoFecha.getText());
						//creando la personaData
					PersonaData infoPersona = new PersonaData(nombrePersona, apellidoPersona, nacimientoPersona);
				
					boolean guardado = almacenador.guardar(infoPersona);
					
					if(guardado) {
						JOptionPane.showMessageDialog(null, "Se ha anadido a la persona con exito.");
					}
					else {
						JOptionPane.showMessageDialog(null, "No se ha podido anadir con exito la persona. Ha ocurrido algun error.");
					}
				}
				catch (IllegalArgumentException exception) {
					JOptionPane.showMessageDialog(null, "No se ha podido anadir con exito la persona. Ha introducido la fecha en un formato erroneo.");
				}
			}
		});
	}

}
