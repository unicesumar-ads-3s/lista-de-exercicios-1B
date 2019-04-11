package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    static int num1;
    static String resultado;
    Scanner scanf = new Scanner(System.in);

    public Exercicio2b() {
    }
    
    
    
    @Override
    public String run() {
        System.out.println("Digite um numero: ");
        num1 = scanf.nextInt();

        if(num1 > 0){
            resultado = "O numero "+num1+" é positivo";
        }else{
            resultado = "O numero "+num1+", convertido para positivo fica: "+num1*-1;
        }
        
        return resultado;
    }
}
