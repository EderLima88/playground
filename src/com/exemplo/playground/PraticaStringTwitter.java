package com.exemplo.playground;

import java.util.Scanner;

public class PraticaStringTwitter {
    public static void main(String[] args) {
        System.out.println("Digite um texto para truncar");
        String t = new Scanner(System.in).nextLine();
        String r = "...";

        int s = t.length();


        if(s < 10) {
            System.out.println(t);
        }else {
            System.out.println(t.substring(0,10).concat(r));
        }
    }
}
