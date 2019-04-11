package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2h implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner (System.in);
    		int valor[] = new int[4];
    		int mai = 0;
        int men = 0;

    		for(int i = 0; i < valor.length; i++){
    			System.out.print("Digite o " +(i+1)+"º valor: ");
    			valor[i] = teclado.nextInt();
    			if(valor[i] > mai){
    				mai = valor[i];
    			}
    		}
    		for (int j = 0; j < valor.length; j++) {
    			if(valor[j] < menor){
    				men = valor[j];
    			}
    		}

        String resultado = "Código não implementado";
        return resultado;
    }
}
