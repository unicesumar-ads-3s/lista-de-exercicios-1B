package br.unicesumar.ads;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Exercicio2e implements InterfaceExercicio {
    Scanner scanf = new Scanner(System.in);
    static StringBuilder resultado = new StringBuilder();
    static int num1;
    static int num2;
    static int num3;
    static int num4;

    public Exercicio2e() {
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
        
        resultado.append("Os seguintes numeros são divisiveis por 2 e por 3 e : ");
        if((num1 % 3) == 0 || (num1 % 2) ==0){
            resultado.append(num1).append(", ");
        }
        if((num2 % 3) ==0 || (num2 % 2) ==0){
            resultado.append(num2).append(", ");
        }
        if((num3 % 3) ==0 ||  (num3 % 2) ==0){
            resultado.append(num3).append(", ");
        }
        if((num4 % 3) ==0 || (num4 % 2) ==0){
            resultado.append(num4).append(", ");
        }     
    




        return resultado.toString();
    }
}
