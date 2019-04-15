package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Celsius: ");
        double celsius = in.nextInt();

        Double F = (9*celsius+160)/5;

        String resultado = "A temperatura em fahrenheit é: " + F;
        return resultado;
        
    }
}
