package com.exemplo.playground;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExercicioTipoPrimitivo {
    public static void main (String[] args) {
        int idade = 42;
        String anoAtual = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
        boolean chuvendo = true;
        double pi = 3.141592653589793;
        char primeiraLetra = 'E';
        float valorDolarAtual = 5.58f;
        float populacaoBrasil = 209300000;
        long populacaoMundo = 7700000000L;

        System.out.println("A idade:" + idade);
        System.out.printf("Valor de PI: %.4f\n", pi);
        System.out.println("Esta chovendo: " + chuvendo);



        int anoAtualizado;
        int quantVendasDia = 1023;
        boolean situacaoPagam; //pago ou não pago
        String formaPag;
        byte[] documento;
        String cnpj;
        float valorProduto;
        double codBarras;


    }
}
