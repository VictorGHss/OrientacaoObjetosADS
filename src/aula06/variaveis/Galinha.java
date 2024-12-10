package aula06.variaveis;

public class Galinha {

	String nome;
	int quantidadeOvos;
	static int quantidadeOvosGranja = 0;

	public void botar() {
		quantidadeOvos = quantidadeOvos + 1;
		quantidadeOvosGranja = quantidadeOvosGranja + 1;
	}
}
