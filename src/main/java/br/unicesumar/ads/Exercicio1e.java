package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Graus em Fahrenheit: ");
        int F = in.nextInt();

        int C = ((F - 32) * 5) / 9;

        double K = C + 273.15;


        String resultado = "Graus Kelvin é " + K;

        return resultado;
    }
}
