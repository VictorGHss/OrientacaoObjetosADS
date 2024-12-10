package aula07.metodoconstrutor;

public class DataTeste {
	
	public static void main(String[] args) {
		Data data1 = new Data(15, 10, 2021);
		System.out.println("Data 1: " + data1.toString());
		
		Data data2 = new Data(7, 12, 2023);
        System.out.println("Data 2: " + data2.toString());
        
        Data data3 = new Data(12, 10, 2021);
        System.out.println("Data 3: " + data3.toString());
	}

}
