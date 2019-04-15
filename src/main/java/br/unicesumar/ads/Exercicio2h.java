package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2h implements InterfaceExercicio {
    Scanner scanf = new Scanner(System.in);
    static String resultado;
    static int valor[] = new int[5];
    static int maior;
    static int menor;

    public Exercicio2h() {
    }
    
    
    
    @Override
    public String run() {
        for(int i=0;i<5;i++){
            System.out.println("Digite o numero "+(i+1)+"º : ");
            valor[i] = scanf.nextInt();
        }
        
            maior = valor[0];
            menor = valor[0];
            
            for(int i=0;i<5;i++){
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
            for(int i=0;i<5;i++){
            if(valor[i] < menor){
                menor = valor[i];
            }
        }
        
            
        resultado = "O valor maior e: "+maior+" O valor menor e: "+menor;
        return resultado;
    }
}
