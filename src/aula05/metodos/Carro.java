package aula05.metodos;

public class Carro {
	
	String modelo;
	String marca;
	String cor;
	int ano;
	String placa;
	
	public void ligar() {
		System.out.println(marca + " " + modelo + " Ligou ");
	}
	
	public void desligar() {
		System.out.println(marca + " " + modelo + " Desligou");
	}
	
	public void acelerar() {
		System.out.println(marca + " " + modelo + " Acelerou");
	}
	
	public void frear() {
		System.out.println(marca + " " + modelo + " Freou");
	}
	
	//exibir informações do carro
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
		System.out.println("Placa: " + placa);
		System.out.println("Cor: " + cor);
	}
}
