package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner(System.in);

        float C, F;

        System.out.println(" Digite a sua temperatura em graus Celsius:");
       C = teclado.nextFloat();
       F =(9 * C + 160)/5;
       String strF=String.format("%.2f",F);

        String strF = "Sua temperatura em Fahrenheit é: ";
        return strF;
    }
}
