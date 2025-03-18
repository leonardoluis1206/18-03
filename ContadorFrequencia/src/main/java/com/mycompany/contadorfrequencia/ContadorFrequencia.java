package com.mycompany.contadorfrequencia;

import java.util.*;

public class ContadorFrequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        
        String[] palavras = frase.split("\\s+");

        
        Map<String, Integer> contagem = new TreeMap<>();

        
        for (String palavra : palavras) {
            palavra = palavra.toLowerCase(); // Converte para minúsculas para ignorar diferenças de maiúsculas/minúsculas
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        
        System.out.println("Contagem das palavras:");
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
