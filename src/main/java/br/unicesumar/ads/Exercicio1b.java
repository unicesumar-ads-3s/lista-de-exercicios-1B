package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner valor = new Scanner(System.in);
        int C, F;
            
		System.out.print("Digite temperatura em graus Celsius: ");
		C = valor.nextDouble();
		
		F = ( 9 * C + 160 ) / 5

        String resultado = "Em graus Fahrenheit é" + F;
        return resultado;
    }
}
