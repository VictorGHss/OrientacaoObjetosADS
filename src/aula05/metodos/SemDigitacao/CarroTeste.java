package aula05.metodos.SemDigitacao;

public class CarroTeste {
	
	public static void main(String[] args) {
		// instanciar objetos  da classe carro
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "Celta";
		carro1.marca = "Chevrolet";
		carro1.ano = 2003;
		carro1.placa = "XXT-6969";
		carro1.cor= "Vermelho sexo";
		
		carro2.modelo = "Fiesta";
		carro2.marca = "Ford";
		carro2.ano = 2006;
		carro2.placa = "JKR-9138";
		carro2.cor= "Azul";
		
		carro3.modelo = "HB20";
		carro3.marca = "Hyundai";
		carro3.ano = 2022;
		carro3.placa = "FDS-8711";
		carro3.cor= "Branco Gelo";
		
		//obtenção de valores dos atributos de cada projeto
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		
		carro1.ligar();
		carro2.ligar();
		carro3.ligar();
		carro1.acelerar();
		
		
	}
}
