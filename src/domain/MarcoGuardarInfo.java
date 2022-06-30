package domain;

import javax.swing.JFrame;

import conexion.AlmacenadorPersonas;
import interfaz.prefabs.CreadorPanelInputInfo;

public class MarcoGuardarInfo extends JFrame {
	
	private CreadorPanelInputInfo creadorPanel;
	
	public MarcoGuardarInfo(CreadorPanelInputInfo creadorPanel) {
			//asignando
		this.creadorPanel = creadorPanel;
		
		setBounds(0, 0, 502, 170);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(creadorPanel.getPanel());
		setVisible(true);
	}
	
}
