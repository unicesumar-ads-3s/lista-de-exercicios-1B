package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner valor = new Scanner (System.in);
        int num1;
        
       
        System.out.println("Digite 1° valor: ");
        num1 = valor.nextInt();
        
        if ((num1 >= 1)&&(num1 <= 9)){
            System.out.println(" O valor está na faixa permitida ");
        }
        else {
            System.out.println(" O valor está fora da faixa permitida ");
        }
        return null;
    }
}
