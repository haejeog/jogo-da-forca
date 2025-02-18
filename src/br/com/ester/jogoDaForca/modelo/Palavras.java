package br.com.ester.jogoDaForca.modelo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Palavras {
	private Random random = new Random();
	
	private List<String> palavras = Arrays.asList(
			"Caneta",
			"Lapis",
			"Caderno",
			"Comida",
			"Pizza",
			"Olhos", 
			"Bola"
			);
	
	protected String palavraAleatoria(){
		return palavras.get(random.nextInt(palavras.size()));
	}
}
