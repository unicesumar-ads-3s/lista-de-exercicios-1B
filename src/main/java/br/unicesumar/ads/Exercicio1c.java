package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

 
       
    Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; 

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n");
		
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Fahrenheit = entrada.nextDouble();
		
		Celsius = (Fahrenheit - 32 ) * 5 / 9;

		System.out.print("\n A medida convertida é " + Celsius + "ºC\n");
		return "\n A medida convertida é " + Celsius + "ºC\n";
	}

}


   