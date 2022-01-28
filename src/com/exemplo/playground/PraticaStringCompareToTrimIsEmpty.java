package com.exemplo.playground;

import java.util.Scanner;

public class PraticaStringCompareToTrimIsEmpty {
    public static void main(String[] args) {
        System.out.println("Digite seu email: ");
        String email = new Scanner(System.in).nextLine();
        String emailT = email.trim();
        String meuEmail = "eder@lima";
        boolean vazio = emailT.isEmpty();



        if(vazio == false) {
            int validar = emailT.compareTo(meuEmail);
            if (validar < 1) {
                System.out.println("loagado");
            } else {
                System.out.println("email errado");
            }
        }else{
            System.out.println("campo vazio não pode");
        }


    }
}
