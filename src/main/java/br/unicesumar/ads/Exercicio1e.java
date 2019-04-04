package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner(System.in);

        float K = 0;
        float C, F;

        System.out.println("Digite a sua temperatura em graus Fahrenheit: ");
        F = teclado.nextFloat();
        C = ((F - 32 )* 5)/9;
        K = (float) (C + 273.15);

        String strK = String.format("%.1f",K)

        System.out.println("Kelvin "+K);



        String strK = "Sua temperatura em graus Kelvin é:";
        return strK;
    }
}
