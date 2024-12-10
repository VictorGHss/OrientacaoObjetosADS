package aula11.ex1;

import java.time.LocalDate;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1, "Gustavo", LocalDate.of(2001, 9, 11), Status.SOLTEIRO);

		cliente1.imprimirCliente();
		
		

	}
}
