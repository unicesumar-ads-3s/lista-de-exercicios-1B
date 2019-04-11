package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    @Override
    public String run() {

        Scanner in = new Scanner(System.in);
        System.out.print("Graus Fahrenheit: ");
        int F = in.nextInt();

        int C = ((F - 32) * 5) / 9;

        String resultado = "Celsius é " + C;

        return resultado;
    }
}
