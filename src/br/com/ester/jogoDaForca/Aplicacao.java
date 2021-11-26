package br.com.ester.jogoDaForca;

import br.com.ester.jogoDaForca.modelo.Jogo;

public class Aplicacao {
	public static void main(String[] args) {
		boolean jogar = true, jogadas = true;
		int cont = 0;
		Jogo p = new Jogo();
		while(jogar){
			jogadas = p.selecionarLetra();
		if(jogadas == false){
			
			cont++;
			System.out.println("\nRestam somente "+ (3-cont)+ " tentativas");
		}
		if(cont==3){
			System.out.println("\nA palavra era: "+p.getPalavra());
			System.out.println("\nVocê perdeu!");
			jogar = false;
		}
		}
	}
}
