package aula06.variaveis;

public class ContaBancariaTeste {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		conta1.criarConta("Marcio Junior", 1750);
		conta1.exibirInfo();
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.criarConta("Eduarda Souza" , 23540);
		conta2.exibirInfo();
		
		ContaBancaria conta3 = new ContaBancaria();
		conta3.criarConta("Jaqueline Silva" , 1270);
		conta3.exibirInfo();
	}

}
