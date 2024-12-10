package aula05.metodos;

import java.util.Scanner;
import java.util.ArrayList;

public class CarroTeste {

	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		ArrayList<Carro> carros = new ArrayList<>(); // listar

		while (true) {
			System.out.println("/nEscolha uma opção:");
			System.out.println("1. Cadastrar um carro.");
			System.out.println("2. Listar carros.");
			System.out.println("3. Sair");

			int opcao = entradaTeclado.nextInt();
			entradaTeclado.nextLine();

			if (opcao == 1) {
				Carro novoCarro = new Carro();

				System.out.println("Informe o modelo do carro: ");
				novoCarro.modelo = entradaTeclado.nextLine();

				System.out.println("Informe a marca do carro: ");
				novoCarro.marca = entradaTeclado.nextLine();

				System.out.println("Informe o ano do carro: ");
				novoCarro.ano = entradaTeclado.nextInt();
				entradaTeclado.nextLine();

				System.out.println("Informe a placa do carro: ");
				novoCarro.placa = entradaTeclado.nextLine();

				System.out.println("Informe a cor do carro: ");
				novoCarro.cor = entradaTeclado.nextLine();

				// adicionar carros
				carros.add(novoCarro);
				System.out.println("Carro cadastrado com sucesso!");

			} else if (opcao == 2) {
				if (carros.isEmpty()) {
					System.out.println("Nenhum carro cadastrado.");
				} else {
					System.out.println("Lista de Carros Cadastrados:");
					for (int i = 0; i < carros.size(); i++) {
						Carro carro = carros.get(i);
						System.out.println("Carro " + (i + 1) + ":");
						System.out.println("Modelo: " + carro.modelo);
						System.out.println("Marca: " + carro.marca);
						System.out.println("Ano: " + carro.ano);
						System.out.println("Placa: " + carro.placa);
						System.out.println("Cor: " + carro.cor);
						System.out.println();
					}
				}
				
			 } else if (opcao == 3) {
	                System.out.println("Saindo...");
	                break;

	            } else {
	                System.out.println("Opção inválida!");
	            }
	        }

	        entradaTeclado.close();
	    }
	}