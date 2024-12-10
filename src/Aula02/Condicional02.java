package Aula02;

import java.util.Scanner;

public class Condicional02 {

	public static void main(String[] args) {

		double valorCompra;

		try (Scanner entradaTeclado = new Scanner(System.in)) {

			System.out.println("Insira o valor total da compra: ");
			valorCompra = entradaTeclado.nextDouble();
		}
		
		double desconto = valorCompra >= 50 ? valorCompra * 0.10 : valorCompra * 0.5;
		
		double valorComDesconto = valorCompra - desconto;

		System.out.println("O valor com desconto é: " + valorComDesconto);
	}

}
