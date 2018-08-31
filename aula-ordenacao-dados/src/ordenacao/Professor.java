package ordenacao; // pacote

public class Professor extends Pessoa{ // classe pessoa
	int salario; // variavel
	
	// metodo construtor
	public Professor(String nome, int idade, int salario) {
		super(nome, idade);
		this.salario = salario;
	}
	
	// imprime mensagem na tela para o usuário
	public void ensinar(String nome) {
		System.out.println("O professor "+nome+" está ensinando. ");
	}
}
