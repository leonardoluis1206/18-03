package com.mycompany.funcionarios2;

import java.util.ArrayList;
import java.util.List;

abstract class Funcionario {
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

    public abstract double getSalarioTotal();
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario, "Desenvolvedor");
    }

    @Override
    public double getSalarioTotal() {
        return getSalario();
    }
}

class Gerente extends Funcionario {
    private double bonusMensal;

    public Gerente(String nome, double salario) {
        super(nome, salario, "Gerente");
        this.bonusMensal = salario * 0.10;
    }

    @Override
    public double getSalarioTotal() {
        return getSalario() + bonusMensal;
    }
}

public class Funcionarios2 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Desenvolvedor("Ana", 4000));
        funcionarios.add(new Gerente("Carlos", 5000));
        
        for (Funcionario f : funcionarios) {
            System.out.println("Salário total de " + f.getClass().getSimpleName() + ": " + f.getSalarioTotal());
        }
    }
}
