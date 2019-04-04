package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
           
		   Scanner valor = new Scanner(System.in);
		double VM, Tempo, KM = 12; 
		double Distancia, Litros;		

				
		System.out.print("Digite o tempo da viagem: ");
		Tempo = valor.nextDouble();
		
		System.out.print("Digite a Velocidade: ");
		VM = valor.nextDouble();

		
		Distancia = VM * Tempo;
		Litros = Distancia / KM;




        String resultado = "A velocidade média é" + VM + ", tempo gasto é" + Tempo + ", distância percorrida é" + Distancia + "e quantidade de litros"
"utilizada na viagem" + Litros;
;
        return resultado;
    }
}
