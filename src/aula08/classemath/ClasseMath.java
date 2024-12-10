package aula08.classemath;
import java.util.Scanner;

public class ClasseMath {
	
	public static void main(String[] args) {
		Scanner scanner  = new Scanner (System.in);
		
		System.out.print("Digite o primeiro numero");
		int num1 = scanner.nextInt();
		
		System.out.print("Digite o segundo numero");
		int num2 = scanner.nextInt();
		
		int maior = Math.max(num1,num2);
		
		double raiz = Math.sqrt(num1);
		
		double potencia = Math.pow(num1, num2);
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Raiz quadrada: " + raiz);
		System.out.println("Potencia: " + potencia);
	}

}
