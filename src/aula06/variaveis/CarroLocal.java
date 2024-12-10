package aula06.variaveis;

public class CarroLocal {

	String modelo;
	String marca;
	String cor;
	int ano;
	String renavam;
	String nmrChassi;
	String placa;
	int velAtual = 0;
	boolean ligado;

	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println(marca + " " + modelo + " ligou ");
		} else {
			System.out.println(marca + " " + modelo + " Já esta ligado ");
		}
	}

	public void desligar() {
		if (!ligado) {
			ligado = false;
			velAtual = 0;
			System.out.println(marca + " " + modelo + " Desligou ");
		} else {
			System.out.println(marca + " " + modelo + " Já esta desligado ");
		}
		System.out.println(marca + " " + modelo + " desligou ");
	}

	public void acelerar(int incremento) {
		velAtual += incremento;
		System.out.println(marca + " " + modelo + " acelerou para " + velAtual + "km/h");
	}

	public void frear(int decremento) {
		if (velAtual >= decremento) {
			velAtual -= decremento;
		} else {
			velAtual = 0;
		}
		System.out.println(marca + " " + modelo + " freou para " + velAtual + "km/h");
	}
	
	public void exibirInfo() {
		System.out.println("Modelo: " + modelo);
		System.out.println ("Marca: " + marca);
		System.out.println ("Ano: " + ano);
		System.out.println ("Cor: " + cor);
		System.out.println ("RENAVAM: " + renavam);
		System.out.println ("Chassi: " + nmrChassi);
		System.out.println ("Placa: " + placa);
		System.out.println ("Estado: " + (ligado ? "Ligado " : "Desligado"));
		System.out.println ("----------------");
	}
}
