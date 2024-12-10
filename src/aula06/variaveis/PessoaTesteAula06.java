package aula06.variaveis;

public class PessoaTesteAula06 {

	public static void main(String[] args) {
		PessoaAula06 pessoa1 = new PessoaAula06();
		PessoaAula06 pessoa2 = new PessoaAula06();
		PessoaAula06 pessoa3 = new PessoaAula06();

		pessoa1.nome = "Marcelo";
		pessoa1.nascimento = "21 / 12 / 2001";
		pessoa1.email = "marcelomaluco@gmail.com";
		pessoa1.telefone = "42991617187";
		pessoa1.estCivil = "Solteiro";

		pessoa2.nome = "Maria Luiza";
		pessoa2.nascimento = "12 / 05 / 2005";
		pessoa2.email = "mariluiza@outlook.com";
		pessoa2.telefone = "1199876237";
		pessoa2.estCivil = "Namorando";

		pessoa3.nome = "Renato Luis";
		pessoa3.nascimento = "16 / 10 / 1986";
		pessoa3.email = "renatocv@yahoo.com";
		pessoa3.telefone = "2199173891";
		pessoa3.estCivil = "Viuvo";
		
		pessoa1.exibirInfo();
		pessoa2.exibirInfo();
		pessoa3.exibirInfo();
	}
}
