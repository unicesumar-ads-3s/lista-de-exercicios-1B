package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        int num;
        int numt;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Mostrar como positivo\n");
         System.out.println("digite algum numero\n");
         num=teclado.nextInt();

         if(num<0)
         {
             numt=num*-1;
         }
         else
         {
             numt=num;
         }




        String resultado = "Código não implementado";
        return resultado;
    }
}
