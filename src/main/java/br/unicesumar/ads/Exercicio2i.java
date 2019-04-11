package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2i implements InterfaceExercicio {
    @Override
    public String run() {
        int num;
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        num = valor.nextInt();
        
        if(num%2==0){
            System.out.println("Numero é PAR");
        }
        else{
            System.out.println("Numero é IMPAR");
        }
        return null;
    }
}
