package com.mycompany.funcionarios2;

class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }
}

class Gerente extends Funcionario {
    private double bonusMensal;

    public Gerente(String nome, double salario) {
        super(nome, salario, "Gerente");
        this.bonusMensal = salario * 0.10;
    }

    public double getSalarioTotal() {
        return getSalario() + bonusMensal;
    }
}

public class Funcionarios2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 5000);
        System.out.println("Salário total do gerente: " + gerente.getSalarioTotal());
    }
}
