package visao;

import java.awt.GridLayout;
import javax.swing.JPanel;
import modelo.Tabuleiro;

public class JTabuleiro extends JPanel {

	private Tabuleiro tabuleiro;
	
	
	public JTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
	}
	
	public void desenhaTabuleiro() {
		this.removeAll();
		this.setLayout(new GridLayout(8,8));
		for ( int i=0; i<8; i++) {
			for ( int j=0; j<8; j++) {
				
			}
		}
		
	}
	
	
	
	
}
