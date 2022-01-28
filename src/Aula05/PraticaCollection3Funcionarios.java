package Aula05;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class PraticaCollection3Funcionarios {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(Path.of("C:\\Users\\ACER\\Desktop\\playground\\src\\Aula05\\pessoas.csv"));

        while (scan.hasNext()) {
            String linha = scan.nextLine();
            //System.out.println(linha);
            String[] campo = linha.split(",");
            //System.out.println(campo);

            StringBuilder stringBuilder = new StringBuilder();

            System.out.println(stringBuilder);



            //Scanner sc = new Scanner(System.in);
            //System.out.println("digite um nome:");
            //String pessoa = sc.nextLine();
            //System.out.println(pessoa);

        }
    }
}
