package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2i implements InterfaceExercicio {
    @Override
    public String run() {
       String result;
       int num;
       
        
        Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
       System.out.println("MOSTRA SE E PAR OU IMPAR\n");
       
       System.out.println("digite um numero qualquer\n");
       num=teclado.nextInt();
       
      if((num  % 2) == 0)  
         result=" par";
      else 
         result=" impar";


        String resultado = "o numero digitado é"+result;
        return resultado;
    }
}
