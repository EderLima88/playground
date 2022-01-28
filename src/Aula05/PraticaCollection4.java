package Aula05;

import java.util.ArrayList;
import java.util.Collections;

public class PraticaCollection4 {
    public static void main(String[] args) {
        ArrayList num = new ArrayList<>();
        num.add(88);num.add(7);num.add(0);num.add(-1);num.add(45);num.add(3);num.add(92);num.add(-9);num.add(300000001);num.add(12);

        System.out.println(num);
        Collections.sort(num);
        Collections.reverse(num);

        System.out.println(num);

    }
}
