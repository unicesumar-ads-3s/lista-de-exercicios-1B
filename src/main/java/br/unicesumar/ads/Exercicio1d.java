package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

     Scanner valor = new Scanner(System.in); 
	 int C, K;

		System.out.print("Digite temperatura em graus Celsius: ");
		C = valor.nextInt(); //Ler uma temperatura em graus Celsius 

		K = C + 273.15; //convertida em graus Kelvin


        String resultado = "Em graus Kelvin é" + K;
        return resultado;
    }
}
