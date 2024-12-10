package aula06.variaveis;

public class PessoaAula06 {

	String nome;
	String nascimento;
	String telefone;
	String email;
	String estCivil;

	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + nascimento);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("Estado Civil: " + estCivil);
		System.out.println("-------------------------");
	}
}
