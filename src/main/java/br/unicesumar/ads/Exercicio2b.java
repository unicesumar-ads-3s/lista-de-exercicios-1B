package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

	Scanner valor = new Scanner(System.in); 
	 int num1, positivo;
	 
	 System.out.print("Digite um valor inteiro qualquer positivo ou negativo: ");
	  num1 = valor.nextInt();
	  
	  if(num1 > 0){
		  positivo = num1;
	  }else {
		  positivo = num1 * (-1);
	  }


        String resultado = "O número lido como um valor positivo: " + positivo;
        return resultado;
    }
}
