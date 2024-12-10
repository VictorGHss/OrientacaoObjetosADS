package aula12.ex1;

public class Conta {

	private int numeroConta;
	private double saldo;
	private Cliente cliente;

	public Conta(int numeroConta, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.saldo = 0.00;
		this.cliente = cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}

	public void exibirDados() {
		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Titular da conta: " + cliente.getNome());
		System.out.println("Cpf: " + cliente.getCpf());
		System.out.println("Saldo: " + saldo);

	}
}
