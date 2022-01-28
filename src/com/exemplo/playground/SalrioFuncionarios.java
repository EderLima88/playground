package com.exemplo.playground;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class SalrioFuncionarios {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(Path.of("src\\com\\exemplo\\playground\\pessoas.csv"));
        //Scanner scan = new Scanner(Path.of("src\\com\\exemplo\\playground\\test.txt"));

        while(scan.hasNext()) {

            String linha = scan.nextLine();

            StringBuilder stringBuilder = new StringBuilder();

            String[] campos = linha.split(",");

            //for (int i = 0; i < campos.length; i++) {
            //    stringBuilder.append(campos[i]);
            //}
            stringBuilder.append(campos[0]).append(campos[1]).append(campos[2]).append(campos[3]);

            System.out.println(stringBuilder);


        }
    }
}
