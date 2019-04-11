package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
	Scanner valor = new Scanner(System.in); 
	 int num1, num2, maior;
	 
	 System.out.print("Digite o primeiro valor inteiro: ");
	  num1 = valor.nextInt();
	  
	 System.out.print("Digite o segundo valor inteiro: ");
	  num2 = valor.nextInt();
	  
	  
	  if(num1 >= num2){
		  maior = num1 - num2;
	  }else {
		  maior = num2 - num1;
	  }
	  
	  
        String resultado = "A diferença do maior valor em relação ao menor valor: " + maior;
        return resultado;
    }
}
