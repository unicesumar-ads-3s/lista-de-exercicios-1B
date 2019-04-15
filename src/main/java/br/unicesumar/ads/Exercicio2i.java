package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2i implements InterfaceExercicio {
    Scanner scanf = new Scanner(System.in);
    static String resultado;
    static int num1;

    public Exercicio2i() {
    }
    
    
    
    @Override
    public String run() {
        System.out.println("Digite um numero: ");
        num1 = scanf.nextInt();
        
        if(num1 % 2 ==0){
            resultado = "O numero "+num1+" e par";
        }else{
            resultado = "O numero "+num1+" e impar";
        }


      
        return resultado;
    }
}
