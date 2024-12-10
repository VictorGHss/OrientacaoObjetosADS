package Aula02;

import java.util.Scanner;
public class EntradaDados {
	
	public static void main (String [] args) {
		
		try (Scanner entradaDados = new Scanner (System.in))
		{
			System.out.println (" Insira seu nome: ");
			String Nome = entradaDados.nextLine ();
			
			System.out.println ("Sexo: ");
			String Sexo = entradaDados.nextLine ();
				
			System.out.println ("Estado civil:");
			String Estado =  entradaDados.nextLine ();
			
			System.out.println ("Quantidade de filhos: ");
			int Filhos = entradaDados.nextInt ();
			
			System.out.println ("Qual seu nivel de escolaridade?: ");
			String Nivel = entradaDados.nextLine ();
			
			entradaDados.nextLine(); //limpando buffer
			
			System.out.println ("Informe sua renda mensal: ");
			double Renda = entradaDados.nextDouble ();
			
			System.out.println ("Nome: " + Nome);
			System.out.println ("Sexo: " + Sexo);
			System.out.println ("Estado Civil: " + Estado);
			System.out.println ("N° de Filhos: " + Filhos);
			System.out.println ("Escolaridade: " + Nivel);
			System.out.println ("Renda mensal: " + Renda + " Reais");
		}
		
	}

}
