package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner(System.in);

        float K, C;

        System.out.println(" Digite a sua temperatura em graus Celsius ");
        C = teclado.nextFloat();
        K = (float) (C + 273.15);

        String strK = String.format("%.2f",K);

        System.out.println("Kelvin "+strK);



        String strK = "A sua temperatura em graus Kelvin é ";
        return strK;
    }
}
