package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner valor = new Scanner(System.in);
        int C, F;
            
		System.out.print("Digite temperatura em graus Fahrenheit: ");
		F = valor.nextDouble();

		C = (( F – 32 ) * 5) / 9


        String resultado = "Em graus Celsius é" + C;
        return resultado;
    }
}
