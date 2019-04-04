package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2i implements InterfaceExercicio {
    @Override
    public String run() {
        int n;
        Scanner teclado = new Scanner (System.in);
        System.out.println(" PAR OU IMPAR ");
        System.out.println("Informe um número: ");
        n = teclado.nextInt();
        
        if(n%2==0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        
    }
}
