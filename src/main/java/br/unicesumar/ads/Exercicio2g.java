package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner teclado = new Scanner (System.in);
        int n;
        
        System.out.println("NUÚMERO ENTRE 1 E 9");
        System.out.println("Informe um valor: ");
        n = teclado.nextInt();
        
        if ((n >= 1)&&(n <= 9)){
            System.out.println(" O valor está na faixa permitida ");
        }
        else {
            System.out.println(" O valor está fora da faixa permitida ");
        }
        return null;
    }
}
