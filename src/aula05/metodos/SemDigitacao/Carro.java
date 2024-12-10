package aula05.metodos.SemDigitacao;

public class Carro {
	
	String modelo;
	String marca;
	String cor;
	int ano;
	String placa;
	
	public void ligar() {
		System.out.println(marca + " " + modelo + " ligou ");
	}
	
	public void desligar() {
		System.out.println(marca + " " + modelo + " desligou");
	}
	
	public void acelerar () {
		System.out.println(marca + " " + modelo + " acelerou");
	}
	
	public void frear () {
		System.out.println(marca + " " + modelo + " freou");
	}
	
	//puxando tudo
	@Override
	public String toString() {
		return "Carro [modelo = " + modelo + ", marca= " + marca + ", ano= " + ano + ", placa= " + placa+ ", cor= " + cor + "]";
		
	}

}
