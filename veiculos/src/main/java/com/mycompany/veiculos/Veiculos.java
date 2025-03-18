package com.mycompany.veiculos;

abstract class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();
    public abstract void frear();
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro " + marca + " " + modelo + " está freando.");
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A moto " + marca + " " + modelo + " está freando.");
    }
}

public class Veiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");
        Moto moto = new Moto("Honda", "CB500");

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
    }
}