package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = in.nextInt();



        String resultado;
        if (n1 > 0 && n1 <=9){
            resultado = "O valor está na faixa permitida";
        }
        else{
            resultado = "O valor está fora da faixa permitida";
        }

        return resultado;
    }
}
