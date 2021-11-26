package br.com.ester.jogoDaForca.modelo;

public class Jogo{

	private String palavra;
	private Palavras palavras = new Palavras();

	
	public Jogo(){
		
		this.palavra = palavras.palavraAleatoria();
		iniciarJogo();
	}
	
	public String getPalavra() {
		return palavra;
	}

	public void setPalavra() {
		this.palavra = palavras.palavraAleatoria();
	}
	
	public void iniciarJogo(){
		for (int i = 0; i < palavra.length(); i++) {
			System.out.print("- ");
			
		}
	}
	public void selecionarLetra(String letra){
		
	}
	
	
}
