package aula03;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    void andar() {
        System.out.println(nome + " está andando.");
    }

    void correr() {
        System.out.println(nome + " está correndo.");
    }

    void falar() {
        System.out.println(nome + " está falando.");
    }
    
    	public String toString() {
    		return "Nome: " + nome + ", Idade: " + idade + ", Peso:" + peso; 
    	}
}
