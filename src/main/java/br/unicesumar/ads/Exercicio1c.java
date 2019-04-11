package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
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

        String resultado = "A temperatura em Celsius é: " + c;
        return resultado;



    }
}
