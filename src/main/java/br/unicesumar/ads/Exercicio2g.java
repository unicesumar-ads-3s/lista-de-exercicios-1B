package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {
    Scanner scanf = new Scanner(System.in);
    static String resultado;
    static int num1;

    public Exercicio2g() {
    }
    
    
    
    @Override
    public String run() {
        System.out.println("Digite um numero: ");
        num1 = scanf.nextInt();
        
        if(num1 >= 1 && num1 <= 9){
        resultado = "O valor está na faixa permitida";
        }else{
        resultado = "O valor está fora da faixa permitida";    
        }


        return resultado;
    }
}
