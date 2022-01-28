package com.exemplo.playground;

import java.util.Scanner;

public class EntradaDeDados {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Informe nome");
                String nome = scan.nextLine();

                System.out.println("Informe nota");
                String nota = scan.nextLine();
                System.out.println("seu nome é: " + nome + " e sua nota é: " + nota);

                int notaInt = (Integer.parseInt(nota));

               if (notaInt > 7) {
                        System.out.println("Você foi aprovado");
                }else {
                        System.out.println("Você foi reprovado");
                }

               switch (notaInt) {
                       case 0:
                               System.out.println("pessimo");
                               break;
                       case 1 :
                               System.out.println("pessimo");
                                break;
                       case 2 :
                               System.out.println("ruim");
                               break;
                       case 3 :
                               System.out.println("regular");
                               break;
                       case 4 :
                               System.out.println("bom");
                               break;
                       case 5 :
                               System.out.println("excelente");
                               break;
                       default:
                               System.out.println("excelente");
               }

                for (int i = 150; i <= 300; i++) {
                        System.out.print(i + " ");
                }

        }
}
