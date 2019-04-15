package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2f implements InterfaceExercicio {
    Scanner scanf = new Scanner(System.in);
    static String resultado;
    static int num1;
    static int num2;
    static int num3;
    static int num4;
    static String div2 = "Os seguintes numeros são divisiveis por 2: " ;
    static String div3 = "Os seguintes numeros são divisiveis por 3: " ;

    public Exercicio2f() {
    }
    

    
    @Override
    public String run() {
        System.out.println("Digite 1º numero: ");
        num1 = scanf.nextInt();
        System.out.println("Digite 2º numero: ");
        num2 = scanf.nextInt();
        System.out.println("Digite 3º numero: ");
        num3 = scanf.nextInt();
        System.out.println("Digite 4º numero: ");
        num4 = scanf.nextInt();
                
        
        if((num1 % 3) == 0) {
            div3 = div3 + num1 +" ";
            
        }
        if(num1 % 2 == 0){
            div2 = div2 + num1 +" ";;
        }
        
        if((num2 % 3) == 0) {
            div3 = div3 + num2 +" ";;
            
        }
        if(num2 % 2 == 0){
            div2 = div2 + num2 +" ";;
        }
        
         if((num3 % 3) == 0) {
            div3 = div3 + num3 +" ";;
            
        }
         if(num3 % 2 == 0){
            div2 = div2 + num3 +", ";;
        }
         
          if((num4 % 3) == 0) {
            div3 = div3 + num4+", ";;
            
        }
          if(num4 % 2 == 0){
            div2 = div2 + num4+", ";;
        }



        resultado = div2 + div3;
        return resultado;
    }
}
