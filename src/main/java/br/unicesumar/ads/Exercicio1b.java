package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner tecla=new Scanner(System.in);
        float C,F;

        System.out.println("Digite a temperatura em Celsius para Fahrenheit");
        C = tecla.nextFloat();

        F = ( 9 * C + 160 ) / 5;
        System.out.println("Fahrenheit: " + F);
        String resultado = "Código não implementado";
        return resultado;
    }
}
