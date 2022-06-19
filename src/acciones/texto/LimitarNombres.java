package acciones.texto;

import java.awt.event.KeyEvent;

import javax.swing.text.JTextComponent;


public class LimitarNombres extends AccionLimitarTexto {
		//CONSTRUCTORES
	public LimitarNombres(int limite_caracteres) {
		super(limite_caracteres);
	}

	
		//IMPLEMENTACIONES
	@Override
	protected boolean isCaracterValido(char caracter) {
		return Character.isLetter(caracter);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		if(!isCaracterValido(e.getKeyChar())) {
			e.consume();
		}
		if(!super.isLimiteValido((JTextComponent) e.getSource())) {
			e.consume();
		}
	}

}
