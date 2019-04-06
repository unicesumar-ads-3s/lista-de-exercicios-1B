package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    public String run() {
        int n;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println(" VALOR POSITIVO ");
        System.out.println("Informe um número: ");
        n = teclado.nextInt();
        
        if(n<=0){
            System.out.println(" "+n);
        }
        else{
            n = n * (-1);
            System.out.println(" "+n);
        }
    }
}
