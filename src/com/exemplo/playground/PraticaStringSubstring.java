package com.exemplo.playground;

//email Carlos carlos@targettrust.com.br

import java.util.Scanner;

public class PraticaStringSubstring {
    public static void main(String[] args) {
        System.out.println("Digite qualquer texto");
        String texto = new Scanner(System.in).nextLine();

        System.out.println(texto.substring(0, 13));

    }
}
