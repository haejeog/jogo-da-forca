package br.com.ester.jogoDaForca.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

	private String palavra;
	private Palavras palavras = new Palavras();
	private Scanner sc = new Scanner(System.in);
	private String teste[];
	private static int count = 0;
	

	public Jogo() {

		this.palavra = palavras.palavraAleatoria();
		iniciarJogo();
		
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra() {
		this.palavra = palavras.palavraAleatoria();
	}

	public void iniciarJogo() {
		String teste[] = new String[palavra.length()];
		for (int i = 0; i < palavra.length(); i++) {
			System.out.print("- ");
			teste[i]= "- ";

		}
		this.teste = teste;

	}

	public boolean selecionarLetra() {
		String[] palavraAuxiliar= palavra.split("");
		String letra;
		List<String> palavras = new ArrayList<>();
		boolean verificarLetra = false,verificarPalavra=false;
		
		System.out.println("\nDigite uma letra:");
		letra = sc.next();
		for (int i = 0; i < teste.length; i++) {
           if(palavraAuxiliar[i].equalsIgnoreCase(letra)){
        	   teste[i]=palavraAuxiliar[i];
        	   verificarLetra = true;
           }
		}
		int contador = 0;
		for (String strin : teste) {
		
		if(!strin.contentEquals("- ")){
			contador++;
		}
			System.out.print(strin+ " ");
			if(contador== palavra.length()){
				System.out.println("\nParabéns, você venceu!!!");
			System.exit(0);
			}
		}
		
		return verificarLetra;
	}

}
