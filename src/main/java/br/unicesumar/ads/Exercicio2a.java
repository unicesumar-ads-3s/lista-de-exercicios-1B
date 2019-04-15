package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    static int num1;
    static int num2;
    static int diferença;
    static String resultado;
    
    Scanner scanf = new Scanner(System.in);

    public Exercicio2a() {
    }
    
    
    
    
    @Override
    public String run() {
       
        System.out.println("Digite um valor para o 1º numero: ");
        num1 = scanf.nextInt();
        System.out.println("Digite um valor para o 2º numero: ");
        num2 = scanf.nextInt();
        
        if(num1 > num2){
            diferença = num1 - num2;
            resultado = "Numero 1º é o maior: "+num1+"   , e a diferença para o numero 2º é de: "+diferença;
        } else if(num1 == num2){
           resultado = "Numero 1º: " + num1 +" é igual a " + "Numero 2º: " +num2;     
        } else{
           diferença = num2 - num1;
           resultado = "Numero 2º é o maior: "+num2+"    ,e a diferença para o numero 2º é de: "+diferença;
        }


        return resultado;
    }
}
