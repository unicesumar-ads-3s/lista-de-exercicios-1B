package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Graus Celsius: ");
        int C = in.nextInt();

        int  F = ( 9 * C + 160 ) / 5;

        String resultado = "Fahrenheit é " + F;
        return resultado;
    }
}
