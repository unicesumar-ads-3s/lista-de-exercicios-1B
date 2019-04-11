package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Insira area do galão: ");
        int A = in.nextInt();

        System.out.print("Insira o raio do galão: ");
        int R = in.nextInt();


        double PI = 3.141592653589793;
        double V = PI*(R*R)*A;

        String resultado = "O volume do galão é " + V;

        return resultado;
    }
}
