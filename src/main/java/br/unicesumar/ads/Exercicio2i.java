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
        String resultado;
        if(n%2==0){
             resultado = "PAR";
            System.out.println("PAR");
            
        }
        else{
             resultado = "IMPAR";
            System.out.println("IMPAR");
             
        }
        return resultado;
    }
}
