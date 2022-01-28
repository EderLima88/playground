package com.exemplo.playground;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("src/com/exemplo/playground/pessoas.csv"));
        boolean cabecalho = true;
        while (scanner.hasNext()) {
            String linha = scanner.nextLine();

            String[] campos = linha.split(",");

            if (cabecalho) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("As informaÃ§Ãµes contidas no arquivo sÃ£o:").append("\n");
                for (int i = 0; i < campos.length; i++) {
                    stringBuilder.append("Ã?ndice ").append(i).append(": ").append(campos[i]).append("; ");
                }
                System.out.println(stringBuilder);
                cabecalho = false;
            } else {
                if (campos.length >= 4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Nome do funcionÃ¡rio:").append("\n")
                            .append("\t").append(campos[0].trim()).append(" ")
                            .append(campos[1].trim()).append("\n");

                    Double salario = Double.parseDouble(campos[2]);
                    Double beneficios = Double.parseDouble(campos[3]);

                    String salarioFormatado = String.format("%,.2f", salario + beneficios);

                    stringBuilder.append("SalÃ¡rio:").append("\n")
                            .append("\t").append("R$ ").append(salarioFormatado)
                            .append("\n");

                    System.out.println(stringBuilder);
                }
            }
        }
    }
}


