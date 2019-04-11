package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2h implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner valor = new Scanner (System.in);
        int num1,num2,num3,num4,num5;
        
      
        System.out.println("Digite 1° valor:");
        num1 = valor.nextInt();
        System.out.println("Digite 2° valor:");
        num2 = valor.nextInt();
        System.out.println("Digite 3° valor:");
        num3 = valor.nextInt();
        System.out.println("Digite 4° valor:");
        num4 = valor.nextInt();
        System.out.println("Digite 5° valor:");
        num5 = valor.nextInt();
        
        if((num1>=num2)&&(num1>=num3)&&(num1>=num4)&&(num1>=num5)){
            System.out.println(" Valor Maior: "+num1);
        }
        else if((num2>=num1)&&(num2>=num3)&&(num2>=num4)&&(num2>=num5)){
            System.out.println(" Valor Maior: "+num2);
        }
        else if((num3>=num1)&&(num3>=num2)&&(num3>=num4)&&(num3>=num5)){
            System.out.println(" Valor Maior:"+num3);
        }
        else if((num4>=num1)&&(num4>=num2)&&(num4>=num3)&&(num4>=num5)){
            System.out.println(" Valor Maior: "+num4);
        }
        else if((num5>=num1)&&(num5>=num2)&&(num5>=num3)&&(num5>=num4)){
            System.out.println(" Valor Maior: "+num5);
        }
        
        if((num1<=num2)&&(num1<=num3)&&(num1<=num4)&&(num1<=num5)){
            System.out.println(" Valor Menor: "+num1);
        }
        else if((num2<=num1)&&(num2<=num3)&&(num2<=num4)&&(num2<=num5)){
            System.out.println(" Valor Menor: "+num2);
        }
        else if((num3<=num1)&&(num3<=num2)&&(num3<=num4)&&(num3<=num5)){
            System.out.println(" Valor Menor: "+num3);
        }
        else if((num4<=num1)&&(num4<=num2)&&(num4<=num3)&&(num4<=num5)){
            System.out.println(" Valor Menor: "+num4);
        }
        else if((num5<=num1)&&(num5<=num2)&&(num5<=num3)&&(num5<=num4)){
            System.out.println(" Valor Menor: "+num5);
        }
        return null;
    }
}
