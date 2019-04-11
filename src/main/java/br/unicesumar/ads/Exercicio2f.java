package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2f implements InterfaceExercicio {
    @Override
    public String run() {
        int num1,num2,num3,num4;
        Scanner valor = new Scanner (System.in);
        System.out.print("Digite 1° valor: ");
	num1 = valor.nextInt();
		
	System.out.print("Digite 2° valor: ");
	num2 = valor.nextInt();
		
	System.out.print("Digite 3° valor: ");
	num3 = valor.nextInt();
        
        System.out.print("Digite 4° valor: ");
	num4 = valor.nextInt();
        
        if((num1%2==0)||(num1%3==0)){
            System.out.println(" Divisivel por 2 ou 3" + num1);
        }
        else if((num2%2==0)||(num2%3==0)){
            System.out.println(" Divisivel por 2 ou 3" + num2);
        }
        else if((num3%2==0)||(num3%3==0)){
            System.out.println(" Divisivel por 2 ou 3" + num3);
        }
        else if((num4%2==0)||(num4%3==0)){
            System.out.println(" Divisivel por 2 ou 3" + num4);
        }
        else {
            System.out.println("Esse número não é divisivel por 2 ou 3");
        }
        return null;
     }
}
