package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2d implements InterfaceExercicio {
    Scanner scanf = new Scanner(System.in);
    static String resultado;
    static int num1;
    static int num2;
    static int num3;

    public Exercicio2d() {
    }
    
    
    
    @Override
    public String run() {
        System.out.println("Digite 1º numero: ");
        num1 = scanf.nextInt();
        System.out.println("Digite 2º numero: ");
        num2 = scanf.nextInt();
        System.out.println("Digite 3º numero: ");
        num3 = scanf.nextInt();
        
        if((num1 <= num2) &&(num2 <= num3)){  
         if(num2 <= num3){
             resultado = "Numeros em ordem crescente: "+num1+","+num2+","+num3;
         }}else if((num2 <= num2)&& (num2 <= num3)){
          if(num1 <= num3){
             resultado = "Numeros em ordem crescente: "+num2+","+num1+","+num3;          
          }else{
             resultado = "Numeros em ordem crescente: "+num2+","+num3+","+num1;         
          }
         }else if(num1 <=num3){
           resultado = "Numeros em ordem crescente: "+num3+","+num1+","+num2;           
         }else{
            resultado = "Numeros em ordem crescente: "+num3+","+num2+","+num1;
        }
        
        return resultado;
    }
}
