package aula03.classeobjeto;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome = "Jurandir";
		pessoa1.idade = 43;
		pessoa1.peso = 78;
		pessoa1.falar = "Quero caga kkk";
		
		pessoa2.nome = "Aline";
		pessoa2.idade = 19;
		pessoa2.peso = 52;
		pessoa2.falar = "vou me matar as 23:57";
		
		pessoa3.nome = "Chris Brigues";
		pessoa3.idade = 57;
		pessoa3.peso = 89;
		pessoa3.falar = "Sou piranha";
		
		pessoa1.amostrarDadoskk();
        pessoa2.amostrarDadoskk();
        pessoa3.amostrarDadoskk();
		
	}
}
