package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2d implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
      Scanner teclado = new Scanner (System.in);
      int num1, num2, num3;

      System.out.println("Digite um numero");
      num1 = teclado.nextInt();
      System.out.println("Digite um numero");
      num2 = teclado.nextInt();
      System.out.println("Digite um numero");
      num3 = teclado.nextInt();

      String strnum1=String.format("%d",num1);
      String strnum2=String.format("%d",num2);
      String strnum3=String.format("%d",num3);

  if((num1<num2)&&(num2<num3)){
      System.out.println("a ordem crescente é: "+strnum1+" "+strnum2+" "+strnum3);
  }else if ((num2<num1)&&(num1<num3)){
      System.out.println("a ordem crescente é: "+strnum2+" "+strnum1+" "+strnum3);
  }else if ((num3<num1)&&(num1<num2)){
      System.out.println("a ordem crescente é: "+strnum3+" "+strnum1+" "+strnum2);
  }else if ((num3<num2)&&(num2<num1)){
      System.out.println("a ordem crescente é: "+strnum3+" "+strnum2+" "+strnum1);
  }else if ((num2<num3)&&(num3<num1)){
      System.out.println("a ordem crescente é: "+strnum2+" "+strnum3+" "+strnum1);
  }else if ((num1<num3)&&(num3<num2)){
      System.out.println("a ordem crescente é: "+strnum1+" "+strnum3+" "+strnum2);
    }
        String resultado = "Código não implementado";
        return resultado;
    }
}
