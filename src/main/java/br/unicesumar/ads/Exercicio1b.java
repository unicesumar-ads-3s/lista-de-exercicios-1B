package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

        



    
        Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit;

		System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n\n");
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();
		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
                return "\n A medida convertida é " + Fahrenheit + "ºF\n";
		
	}

}
    
    
