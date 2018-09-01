package ordenacao; // pacote

public class Pessoa { // classe
	String nome; // variavel
	int idade; // variavel
	
	// metodo construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	// imprimi mensagem na tela para o usuario
	public void falar() {
		System.out.println("A Pessoa está falando preste atenção.");
		
	}
}
