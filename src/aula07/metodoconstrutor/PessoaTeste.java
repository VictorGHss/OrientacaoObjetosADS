package aula07.metodoconstrutor;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Jurandir", 43, 78);

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.idade + "anos");
		System.out.println(pessoa1.peso + "kg");
		System.out.println("----------");

		Pessoa pessoa2 = new Pessoa("Aline", 19, 52);

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.idade + "anos");
		System.out.println(pessoa2.peso + "kg");
		System.out.println("----------");

		Pessoa pessoa3 = new Pessoa("Pedro", 24, 88);
		
		System.out.println(pessoa3.nome);
		System.out.println(pessoa3.idade + "anos");
		System.out.println(pessoa3.peso + "kg");
		System.out.println("----------");
	}
}
