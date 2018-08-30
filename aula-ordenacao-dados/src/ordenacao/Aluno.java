package ordenacao; // pacote

public class Aluno { extends Pessoa { // classe
	
	String sexo; // variavel
	int matricula; //variavel
	
		// construtor
		public Aluno(String nome, int idade, int matricula) {
			super(nome, idade);
			this.matricula = matricula;
		}
	// metodo estudar, imprime mensagem na tela pro usuário
	public void estudar() {
		System.out.println("Aluno estudar. ");
	}
	
}

//email: eudisozatunes@gmail.com

//- Comente o códico, (descreva), onde, quais são, qual a função, 
// o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= método
//=atributo
//=varialveis
//=hereça