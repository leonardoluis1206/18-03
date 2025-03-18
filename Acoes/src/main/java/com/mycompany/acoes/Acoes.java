package com.mycompany.acoes;

import java.util.Stack;

public class Acoes {
    public static void main(String[] args) {
        Stack<String> pilhaAcoes = new Stack<>();
        Stack<String> pilhaRefazer = new Stack<>();

        adicionarAcao(pilhaAcoes, pilhaRefazer, "Ação 1");
        adicionarAcao(pilhaAcoes, pilhaRefazer, "Ação 2");
        adicionarAcao(pilhaAcoes, pilhaRefazer, "Ação 3");

        desfazerAcao(pilhaAcoes, pilhaRefazer);
        desfazerAcao(pilhaAcoes, pilhaRefazer);
        refazerAcao(pilhaAcoes, pilhaRefazer);
        desfazerAcao(pilhaAcoes, pilhaRefazer);
        refazerAcao(pilhaAcoes, pilhaRefazer);
        refazerAcao(pilhaAcoes, pilhaRefazer);
    }

    public static void adicionarAcao(Stack<String> acoes, Stack<String> refazer, String acao) {
        acoes.push(acao);
        refazer.clear(); // Limpa o refazer sempre que uma nova ação é adicionada
        System.out.println("Ação adicionada: " + acao);
        exibirPilhas(acoes, refazer);
    }

    public static void desfazerAcao(Stack<String> acoes, Stack<String> refazer) {
        if (!acoes.isEmpty()) {
            String acaoDesfeita = acoes.pop();
            refazer.push(acaoDesfeita);
            System.out.println("Desfez: " + acaoDesfeita);
        } else {
            System.out.println("Nada para desfazer.");
        }
        exibirPilhas(acoes, refazer);
    }

    public static void refazerAcao(Stack<String> acoes, Stack<String> refazer) {
        if (!refazer.isEmpty()) {
            String acaoRefazer = refazer.pop();
            acoes.push(acaoRefazer);
            System.out.println("Refazer: " + acaoRefazer);
        } else {
            System.out.println("Nada para refazer.");
        }
        exibirPilhas(acoes, refazer);
    }

    public static void exibirPilhas(Stack<String> acoes, Stack<String> refazer) {
        System.out.println("Pilha de Ações: " + acoes);
        System.out.println("Pilha de Refazer: " + refazer);
    }
}
