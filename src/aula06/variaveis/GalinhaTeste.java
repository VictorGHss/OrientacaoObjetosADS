package aula06.variaveis;

public class GalinhaTeste {

	public static void main(String[] args) {

		Galinha g1 = new Galinha();
		g1.nome = "Giselda";
		g1.botar();
		g1.botar();
		g1.botar();

		Galinha g2 = new Galinha();
		g2.nome = "Matilde";
		g2.botar();
		g2.botar();

		Galinha g3 = new Galinha();
		g3.nome = "Marina";
		g3.botar();

		System.out.println(g1.nome);
		System.out.println(g1.quantidadeOvos + " ovos.");
		System.out.println("------------");

		System.out.println(g2.nome);
		System.out.println(g2.quantidadeOvos + " ovos.");
		System.out.println("------------");

		System.out.println(g3.nome);
		System.out.println(g3.quantidadeOvos + " ovos.");
		System.out.println("------------");
		
		System.out.println("Total de ovos na granja: " + Galinha.quantidadeOvosGranja);
	}
}
