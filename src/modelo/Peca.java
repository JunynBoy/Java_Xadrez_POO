package modelo;

public abstract class Peca {

	private EnumCor cor;
	private int linha, coluna;
	private String imagem; //a String vai armazenar o nome da imagem que representa a peça
	private boolean eliminada = false;
	private boolean selecionada = false;
	private Tabuleiro tabuleiro;
	
	//metodos
	public abstract boolean validaMovimento(int linhaDestino, int colunaDestino);
	
	//construtor
	public Peca(EnumCor cor, int linha, int coluna, String imagem) {
		this.cor = cor;
		this.linha = linha;
		this.coluna = coluna;
		this.imagem = imagem;
	}
	
	//getters e setters
	public EnumCor getCor() {
		return cor;
	}
	
	public void setCor(EnumCor cor) {
		this.cor = cor;
	}
	
	public int getLinha() {
		return linha;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public int getColuna() {
		return coluna;
	}
	
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public boolean getEliminada() {
		return eliminada;
	}
	
	public void setEliminada(boolean eliminada) {
		this.eliminada = eliminada;
	}
	
	public boolean isSelecionada() {
		return selecionada;
	}
	
	public void setSelecionada(boolean selecionada) {
		this.selecionada = selecionada;
	}
	
	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public Tabuleiro getTabuleiro() {
		return this.tabuleiro;
	}
	
	
	
	
	
	
	
	
}
