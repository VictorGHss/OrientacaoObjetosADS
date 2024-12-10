package aula06.variaveis;

import java.util.Scanner;

public class TempoQuedaTeste {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite a altura: ");
			double altura = scanner.nextDouble();

			double tempoDeQueda = TempoQueda.calcularTempoQueda(altura);

			System.out.printf("O tempo de queda do objeto é de %.2f segundos.%n", tempoDeQueda);
		}
	}
}
