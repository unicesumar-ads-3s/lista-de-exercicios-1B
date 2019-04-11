package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2d implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner valor = new Scanner (System.in);
        int num1, num2, num3;

        System.out.print("Digite 1° valor: ");
	num1 = valor.nextInt();
		
	System.out.print("Digite 2° valor: ");
	num2 = valor.nextInt();
		
	System.out.print("Digite 3° valor: ");
	num3 = valor.nextInt();

        String strnum1=String.format("%d",num1);
        String strnum2=String.format("%d",num2);
        String strnum3=String.format("%d",num3);

    if((num1<num2)&&(num2<num3)){
        System.out.println("Ordem crescente é: "+strnum1+" "+strnum2+" "+strnum3);
    }else if ((num2<num1)&&(num1<num3)){
        System.out.println("Ordem crescente é: "+strnum2+" "+strnum1+" "+strnum3);
    }else if ((num3<num1)&&(num1<num2)){
        System.out.println("Ordem crescente é: "+strnum3+" "+strnum1+" "+strnum2);
    }else if ((num3<num2)&&(num2<num1)){
        System.out.println("Ordem crescente é: "+strnum3+" "+strnum2+" "+strnum1);
    }else if ((num2<num3)&&(num3<num1)){
        System.out.println("Ordem crescente é: "+strnum2+" "+strnum3+" "+strnum1);
    }else if ((num1<num3)&&(num3<num2)){
        System.out.println("Ordem crescente é: "+strnum1+" "+strnum3+" "+strnum2
        );

        return "";
    }




        String resultado = "Código não implementado";
        return resultado;
    }
}
