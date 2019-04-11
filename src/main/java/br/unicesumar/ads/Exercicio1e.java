package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Fahrenheit: ");
        double Fahrenheit = in.nextInt();
        
        Double c = ((Fahrenheit-32)*5)/9;                       
        Double K = c +273.15;

        String resultado = "A temperatura em Kelvin é: " + K;
        return resultado;



    }
}
