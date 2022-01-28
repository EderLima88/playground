package com.exemplo.playground;

import java.util.Scanner;

public class PraticaStringSplit {
    public static void main(String arg[]) {
        System.out.println("Digite qualquer texto");
        String texto = new Scanner(System.in).nextLine();

        String[] p = texto.split(" ");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }


        System.out.print(p);

    }


}
