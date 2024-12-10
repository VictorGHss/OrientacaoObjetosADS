package aula11.ex1;

import java.time.LocalDate;

public class Cliente {

    private int id;
    private String nome;
    private LocalDate dataNasc;
    private Status statusCivil;

    public Cliente(int id, String nome, LocalDate dataNasc, Status statusCivil) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.statusCivil = statusCivil;
    }

    public void imprimirCliente() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNasc);
        System.out.println("Status Civil: " + this.statusCivil);
    }

    public void setStatus(Status statusCivil) {
        this.statusCivil = statusCivil;
    }
}
