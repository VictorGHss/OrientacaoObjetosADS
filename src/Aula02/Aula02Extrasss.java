package Aula02;

public class Aula02Extrasss {
	public static void main(String[] args) {
		double a = 1.0;
		double b = -3.0;
		double c = 2.0;
		double delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("N tem raiz nao fi");
		} else {

			double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
			double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("Raiz 1: " + raiz1);
			System.out.println("Raiz 2: " + raiz2);
		}
	}
}