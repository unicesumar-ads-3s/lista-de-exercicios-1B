package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        
		Scanner valor = new Scanner(System.in);
		double num1, num2, num3, num4, media;
		String situacao;
		
		System.out.print("Digite 1° nota: ");
		num1 = valor.nextDouble();
		
		System.out.print("Digite 2° nota: ");
		num2 = valor.nextDouble();
		
		System.out.print("Digite 3° nota: ");
		num3 = valor.nextDouble();
		
		System.out.print("Digite 4° nota: ");
		num4 = valor.nextDouble();
		
		
		media = (num1 + num2 + num3 + num4)/4;
		
		if(media >= 6){
			
			situacao = "Aprovado";
		}else{
			
			situacao = "Reprovado";
		}
		
		
        String resultado = "Status: " + situacao + " Media: " + media;
        return resultado;
    }
}
