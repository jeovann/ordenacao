package ordenacao; // pacote

public class Aluno extends Pessoa { // classe
	
	String sexo; // variavel
	int matricula; //variavel
	
		// construtor
		public Aluno(String nome, int idade, int matricula) {
			super(nome, idade);
			this.matricula = matricula;
		}
	// metodo estudar, imprime mensagem na tela pro usu�rio
	public void estudar() {
		System.out.println("O Aluno estudar Java na Faculdade. ");
	}
	
}

//email: eudisozatunes@gmail.com

//- Comente o c�dico, (descreva), onde, quais s�o, qual a fun��o, 
// o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= m�todo
//=atributo
//=varialveis
//=here�a