package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner tecla=new Scanner(System.in);
        float C,K,F;

        System.out.println("Digite a temperatura em Fahrenheit para Kelvin");
        F = tecla.nextFloat();
        C=((F-32)*5)/9;
         K=(float) (C+273.15);
        System.out.println("Kelvin: " + K);
        String resultado = "Código não implementado";
        return resultado;
    }
}
