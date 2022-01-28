package com.exemplo.playground;

public class PraticaDeComandos2 {
    public static void main(String[] args) {
//Prática 1
        long n;
        n = 0;
        for (int c = 0; c <= 1000 ; c++) {
            n = n + c;
        }
        System.out.println(n);

//Prática 2
        for (int i = 0; i <=100 ; i+=3) {
            System.out.println(i);
        }


//Prática 4
        int f = 1;
        for (int cont = 1; cont <=10; cont++) {
            f = f * cont;
            System.out.println("Fatorial de: " + cont + " é " + f);
        }
    }
}
