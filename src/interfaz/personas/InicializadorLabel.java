package interfaz.personas;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicializadorLabel {
		//METODOS
	public static JLabel inicializarLabel(JLabel label, String texto) {
		label = new JLabel(texto);
		
		return label;
	}
	
}
