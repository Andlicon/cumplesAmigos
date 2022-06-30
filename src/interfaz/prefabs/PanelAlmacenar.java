package interfaz.prefabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import conexion.IAlmacenador;

/**
 * Es una lamina basica para extraer informacion del usuario a traves de 
 * JTextFields y enviar su informacion a una base de datos
 * 
 * MODELO:
 * |JLabel01| |JTextField01|
 * 	   .			.
 *     .			.
 *     .			.
 * |JLabel0N| |JTextField0N|
 * 
 * |JButton01|...|JButton0N|
 * 
 * @author Andlicon
 */
public class PanelAlmacenar<T extends Serializable> extends JPanel {
		//COONSTANTES
	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;
	
	
		//ATRIBUTOS
	/**
	 * Componentes a ser anadido al panel
	 */
	private Hashtable<JLabel, JTextField> componentes;
	/**
	 * Botones donde indice:
	 * 
	 * indice 0 = Cargar
	 * indice 1 = Limpiar
	 */
	private JButton[] botones;
	
	
		//CONSTRUCTORES
	public PanelAlmacenar(IAlmacenador<T> almacenador, Hashtable<JLabel, JTextField> componentes, JButton cargar) {
			//inicializando botones 
		JButton limpiar = new JButton("Limpiar");
		this.botones = new JButton[] {cargar, limpiar};
		inicializarBotonLimpiar();
		
			//inicializando atributos
		this.componentes = componentes;
		
		disenarDisplay();
	}
	
	
		//METODOS
	private void disenarDisplay() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Set<JLabel> Setllaves = componentes.keySet();
		
			//Anadiendo todos los JLabel y JTextField de la liberia
		for(JLabel llave : Setllaves) {
			Box caja = new Box(BoxLayout.X_AXIS);
			caja.add(llave);
			caja.add(componentes.get(llave));
			add(caja);
		}
		
			//Anadiendo todos los botones que tendra el panel
		Box cajaBotones = new Box(BoxLayout.X_AXIS);
		
		for(JButton boton : botones) {
			cajaBotones.add(boton);
		}
		
		add(cajaBotones);
	}
	
	private void inicializarBotonLimpiar() {
		JButton limpiar = botones[1];
		
		limpiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	//Borra los JTextField
				
				Set<JLabel> Setllaves = componentes.keySet();
				
				for(JLabel llave : Setllaves) {
					JTextField textos = componentes.get(llave);
					
					textos.setText("");
				}
				
			}
			
		});
	
	}
	
}
