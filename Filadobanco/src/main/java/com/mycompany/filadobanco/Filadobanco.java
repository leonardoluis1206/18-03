package com.mycompany.filadobanco;

import java.util.LinkedList;
import java.util.Queue;

public class Filadobanco {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        
        
        adicionarCliente(filaClientes, "Cliente 1");
        adicionarCliente(filaClientes, "Cliente 2");
        adicionarCliente(filaClientes, "Cliente 3");
        
       
        atenderCliente(filaClientes);
        atenderCliente(filaClientes);
        atenderCliente(filaClientes);
        atenderCliente(filaClientes); // Tentando remover de uma fila vazia
    }
    
    public static void adicionarCliente(Queue<String> fila, String cliente) {
        fila.offer(cliente);
        System.out.println(cliente + " entrou na fila.");
        exibirFila(fila);
    }
    
    public static void atenderCliente(Queue<String> fila) {
        String clienteAtendido = fila.poll();
        if (clienteAtendido != null) {
            System.out.println(clienteAtendido + " foi atendido.");
        } else {
            System.out.println("Nenhum cliente na fila para atendimento.");
        }
        exibirFila(fila);
    }
    
    public static void exibirFila(Queue<String> fila) {
        System.out.println("Fila atual: " + fila);
    }
}
