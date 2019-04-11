package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Graus Celsius: ");
        int C = in.nextInt();

        double K = C + 273.15;

        String resultado = "Graus Kelvin é " + K;

        return resultado;
    }
}
