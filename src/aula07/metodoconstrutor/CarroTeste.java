package aula07.metodoconstrutor;

public class CarroTeste {
	
	public static void main(String[] args) {
		Carro carro1 = new Carro("Gol", "Volks", 2020);
		
		System.out.println(carro1.modelo);
		System.out.println(carro1.marca);
		System.out.println(carro1.ano);
		
		Carro carro2 = new Carro("Fusion", "Ford", 2018);
		
		System.out.println(carro2.modelo);
		System.out.println(carro2.marca);
		System.out.println(carro2.ano);
	}

}
