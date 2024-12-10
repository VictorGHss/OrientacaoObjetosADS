package aula06.variaveis;

public class ContaBancaria {

	static int totalContas = 0;
	int nmrConta;
	String nomeTitular;
	double saldo;

	public void criarConta(String nome, double saldoInicial) {
		totalContas++;
		nmrConta = totalContas;
		nomeTitular = nome;
		saldo = saldoInicial;
	}

	public void exibirInfo() {
		System.out.println("Numero da conta: " + nmrConta);
		System.out.println("Nome do titula: " + nomeTitular);
		System.out.println("Saldo inicial: " + saldo);
		System.out.println("-----------");
	}
}
