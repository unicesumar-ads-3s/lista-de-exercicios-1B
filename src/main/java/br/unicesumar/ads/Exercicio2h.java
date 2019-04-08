package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2h implements InterfaceExercicio {
    @Override
    public String run() {
        
      	Scanner teclado = new Scanner (System.in);
		int valor[] = new int[4];
		int maior = 0;
                int menor = 0; 
                
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = teclado.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
			}
		}
		
	




        String resultado = "o maior valor e "+maior+" o menor valor e "+menor;
        return resultado;
    
    }
}
