package ordenacao; // pacote

public class Teste { // classe teste
	public static void main(String[] args ) {
		
		// metodo construdor
		Pessoa p1 = new Pessoa("um dois tr�s", 99);
		p1.nome = "Jeovan Ferreira da Costa";
		p1.falar();
		
		Aluno a1 = new Aluno("Jeovan Ferreira da Costa.", 68, 20);
		a1.sexo = "M";
		a1.estudar();
		a1.falar();
		System.out.println("O nome da pessoa �: " + p1.nome);
		
		Professor prof1 = new Professor("Eudes,", 69, 2000);
		prof1.falar();
		prof1.ensinar(prof1.nome);
		
	}

}
