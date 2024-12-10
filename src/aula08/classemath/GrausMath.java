package aula08.classemath;

import java.util.Scanner;

public class GrausMath {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Digite um valor em graus: ");
			double grau = scanner.nextDouble();

			double radianos = Math.toRadians(grau);

			double seno = Math.sin(radianos);

			double cosseno = Math.cos(radianos);

			double tang = Math.tan(radianos);

			System.out.println("Seno: " + seno);
			System.out.println("Cosseno: " + cosseno);
			System.out.println("Tangente: " + tang);
		}
	}
}
