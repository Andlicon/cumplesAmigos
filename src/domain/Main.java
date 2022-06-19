package domain;

import java.util.Date;

import javax.swing.JFrame;

import interfaz.personas.PanelPersona;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(0, 0, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new PanelPersona());
	}
}
