package com.exemplo.playground;

public class MenorNumeroLista {

    public static void main(String[] args){
        int[] lista = {88,7,0,-1,45,3,92,-9,300000001,12,23567};
        int min = lista[0];
        for (int i = 0; i < lista.length; i++) {
            //System.out.println(lista[i]);
            if(lista[i] < min) {
                min = lista[i];
            }
        }
        System.out.println(min);
    }
}
