package Aula02;

import java.util.Scanner;
public class Condicional {
	
	public static void main (String [] args) {
		
		int num1, num2, num3;
		
		try (Scanner entradaTeclado = new Scanner(System.in)) {
			System.out.println("Bota o 1° número ai baitola:");
			num1 = entradaTeclado.nextInt();

			System.out.println("Agora o 2° número ai arrombado:");
			num2 = entradaTeclado.nextInt();

			System.out.println("Só o 3° agora viado:");
			num3 = entradaTeclado.nextInt();

		}
		
		int maior = num1;
		
		if (num2 > maior) {
			maior = num2;
		}
		
		if (num3 > maior) {
			maior = num3;
		}
		
		System.out.println ("O maior numero é: " + maior);
		
	}

}
