package com.exemplo.playground;

import java.util.Scanner;

public class PraticaStringIndexof {
    public static void main(String[] args) {

        System.out.println("Escreva uma frase");
        String scan = new Scanner(System.in).nextLine();

        int scanOf = scan.indexOf(",");


        for (int i = 0; i < scanOf; i++) {
            char c = scan.charAt(i);
            System.out.print(c);
        }

    }
}
