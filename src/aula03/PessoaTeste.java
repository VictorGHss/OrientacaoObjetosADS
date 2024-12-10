package aula03;

import java.util.Scanner;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		try (Scanner entradaTeclado = new Scanner(System.in)){
		
			Pessoa pessoa1 = new Pessoa ();
			pessoa1.nome= "Jurandir";
			pessoa1.idade= 13;
			pessoa1.peso= 41.5;
			
			
			Pessoa pessoa2 = new Pessoa ();
			pessoa2.nome= "Aline";
			pessoa2.idade= 19;
			pessoa2.peso= 54.7;
			
			Pessoa pessoa3 = new Pessoa ();
			pessoa3.nome= "Ronaldo";
			pessoa3.idade= 34;
			pessoa3.peso= 76.4;
			
			System.out.println(pessoa1);
			System.out.println(pessoa2);
			System.out.println(pessoa3);
		}

	}

}
