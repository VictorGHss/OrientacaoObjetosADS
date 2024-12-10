package aula06.variaveis;

public class CarroLocalTeste {
	
	public static void main(String[] args) {
		CarroLocal meuCarro = new CarroLocal();
		
		meuCarro.modelo = "Celta";
		meuCarro.marca = "Chevrolet";
		meuCarro.ano = 2003;
		meuCarro.cor = "Vermelho";
		meuCarro.renavam = "1234567890";
		meuCarro.nmrChassi = "15332213084";
		meuCarro.placa = "AXT-1533";
		
		meuCarro.exibirInfo();
		
		meuCarro.ligar();
		meuCarro.acelerar(80);
		meuCarro.acelerar(35);
		meuCarro.frear(50);
		meuCarro.desligar();
	}

}
