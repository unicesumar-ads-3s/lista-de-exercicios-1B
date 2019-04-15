package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Insira numero 1: ");
        int N1 = in.nextInt();

        System.out.print("Insira numero 2: ");
        int N2 = in.nextInt();
        int VALOR = 0;


        if (N1>N2){
            VALOR = N1-N2;
        }
        else{
            VALOR = N2-N1;
        }

        String resultado = "A diferença é de  " + VALOR;

        return resultado;
    }
}
