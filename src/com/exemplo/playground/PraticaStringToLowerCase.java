package com.exemplo.playground;

import java.util.Scanner;

public class PraticaStringToLowerCase {
    public static void main(String[] args) {
        System.out.println("Digite um texto para converter a primeira palavra em maiusculas: ");
        String texto = new Scanner(System.in).nextLine() ;
        //System.out.println(texto);

        String[] t = texto.split(" ");
        for (int i = 0; i <t.length ; i++) {
            //System.out.print(t[i] + " ");
        }
        System.out.print(t[0].toUpperCase() + " ");

        for (int i = 1; i <t.length ; i++) {
            System.out.print(t[i] + " ");
        }
    }
    }



