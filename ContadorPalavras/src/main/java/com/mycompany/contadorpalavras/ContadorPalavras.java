package com.mycompany.contadorpalavras;

import java.util.*;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();
        scanner.close();
        
        String[] palavras = texto.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
        
        Set<String> palavrasUnicas = new TreeSet<>(Arrays.asList(palavras));
    
        System.out.println("Quantidade de palavras únicas: " + palavrasUnicas.size());
        System.out.println("Lista ordenada de palavras únicas: " + palavrasUnicas);
    }
}
