package visao;

import javax.swing.JPanel;

public class JCelula extends JPanel {

	private JPeca jPeca;
	private int linha, coluna;
	
	public JCelula (int linha,int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
}
