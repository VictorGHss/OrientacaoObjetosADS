package aula12.parametrico;

public class BancoTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco(123456, "Nubank");

		banco1.adicionarNovaConta(111, "Fabio");

		banco1.verificarSaldoConta(111);
		
		banco1.realizarDepositoConta(111, 700.000);
		
		banco1.verificarSaldoConta(111);

	}
}