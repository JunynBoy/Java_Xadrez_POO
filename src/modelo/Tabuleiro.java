package modelo;

public class Tabuleiro {

	private Peca[][] pecas;
	private Peca pecaSelecionada = null;
	private EnumCor vez = EnumCor.BRANCO;
	
	public static final int TEMPO_JOGADA = 10000;
	
	
	public Tabuleiro(int linha, int coluna) {
		this.pecas = new Peca[linha][coluna];
	}


	public Peca getPeca(int linha, int coluna) {
		return this.pecas[linha][coluna];
	}
	
	public void adicionaPeca(Peca peca) {
		this.pecas[peca.getLinha()][peca.getColuna()] = peca;
		peca.setTabuleiro(this); 
	}
	
	public void selecionaPeca(Peca peca) {
		if(peca.isSelecionada()) { // no caso da peça estar selecionada ele desmarca
			peca.setSelecionada(false);
			this.pecaSelecionada = null;
		} else {// no caso da peça nao estar selecionada ele marca a peça
			peca.setSelecionada(true);
			this.pecaSelecionada = peca;
		}
	}
	
	
	public void movePeca(Peca peca, int novaLinha, int novaColuna) {
		//escrever dps
		peca.setColuna(novaColuna);
		peca.setLinha(novaLinha);
		
		
	}
	
	public void inverteVez() {
		if (this.vez.equals(EnumCor.BRANCO)) {
			this.vez = EnumCor.PRETO;
		}else {
			this.vez = EnumCor.BRANCO;
		}
	}
	
	
}
