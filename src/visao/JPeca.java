package visao;

import javax.swing.JLabel;

import modelo.Peca;

public class JPeca extends JLabel {

	private Peca peca;
	
	public JPeca(Peca peca) {
		this.peca = peca;
	}
	
	
	public Peca getPeca() {
		return this.peca;
	}
}
