package domain;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import interfaz.personas.PanelPersona;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 502, 170);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new PanelPersona());
		frame.setVisible(true);
	}
}
