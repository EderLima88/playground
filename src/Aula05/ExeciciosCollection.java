package Aula05;

import java.util.ArrayList;

public class ExeciciosCollection {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Azul");

        System.out.println(cores);

        cores.remove(1);

        System.out.println(cores);

        cores.add("Marrom");

        System.out.println(cores);

        System.out.println(cores.size() -1);

        int ind = cores.indexOf("Azul");
        System.out.println(cores.get(ind));


        cores.set(1, "verde");

        System.out.println(cores);
    }
}
