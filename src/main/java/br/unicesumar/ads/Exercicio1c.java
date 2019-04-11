package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner tecla=new Scanner(System.in);
            float C,F;

            System.out.println("Digite a temperatura em Fahrenheit para Celsius");
            F = tecla.nextFloat();

            C=((F-32)*5)/9;
            System.out.println("Celsius: " + C);
        String resultado = "Código não implementado";
        return resultado;
    }
}
