package interfaz.personas;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicializadorLabel {
		//ATRIBUTOS
	/**
	 * Panel al que se anadiran los labels
	 */
	private JPanel panel;
	
	
		//CONSTRUCTOR
	/**
	 * Constructor basico para inicializar labels
	 * 
	 * @param panel panel al cual se anadiran los labels
	 */
	public InicializadorLabel(JPanel panel) {
		this.panel = panel;
	}
	
	
		//METODOS
	public void inicializarLabel(JLabel label, String texto) {
		label = new JLabel(texto);
		
		panel.add(label);
	}
	
}
