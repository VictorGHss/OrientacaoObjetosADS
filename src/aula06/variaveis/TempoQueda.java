package aula06.variaveis;

public class TempoQueda {

	final static double GRAVIDADE_TERRA = 9.8;

	public static double calcularTempoQueda(double altura) {
		return Math.sqrt(2 * altura / GRAVIDADE_TERRA);
	}
}
