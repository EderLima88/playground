package Aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PraticaCollections2 {
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>();
        num.add(88);
        num.add(7);
        num.add(0);
        num.add(-1);
        num.add(45);
        num.add(3);
        num.add(92);
        num.add(-9);
        num.add(300000001);
        num.add(12);
        num.add(23567);
        Collections.sort(num);

        System.out.println(num);
        System.out.println(num.size()-1);

        Integer[] n = num.toArray(new Integer[0]);

        for (int i = 0; i <n.length ; i++) {

            if(n[i] < 0) {
                System.out.println(n[i] + " - negativo");
            }else if (n[i] == 0) {
                System.out.println(n[i] + " - Zero" );
            }else {
                System.out.println(n[i] + " - positivo");
            }
        }
    }
}
