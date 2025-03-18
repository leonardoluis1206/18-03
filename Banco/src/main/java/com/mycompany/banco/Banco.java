package com.mycompany.banco;

public class Banco {
    private int numeroConta;
    private double saldo;
    private String titular;

    public Banco(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Banco conta = new Banco(12345, "João Silva", 1000.00);
        
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(1500);
        
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
