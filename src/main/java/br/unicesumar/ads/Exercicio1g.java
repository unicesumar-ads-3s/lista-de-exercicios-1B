package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

		Scanner valor = new Scanner(System.in);
		double R, A, V;
		
		System.out.print("Digite diâmeto: ");
		R = valor.nextDouble()/2;
        
		System.out.print("Digite área: ");
		A = valor.nextDouble();
		
		V = Math.PI * R * R * A;

        String resultado = "O valor do volume do galão:" + V;
        return resultado;
    }
}
