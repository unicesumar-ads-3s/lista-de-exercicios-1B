package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        float n1;
        float n2;
        float n3;
        float n4;
        String bool;
        int[] vet=new int[5];
        float media=0;
        int i;

        Scanner teclado=new Scanner(System.in);
        System.out.println("Mostra reprovado ou nao \n");


         for(i=1;i<=4;i++)
         {
             System.out.println("digite a "+i+" nota\n");
             vet[i]=(int)teclado.nextFloat();
             media=vet[i]+media;

         }
         media=media/4;


         if(media>=60)
         {
             bool="APROVADO";


         }
         else
         {
             bool="REPROVADO";
         }

        String resultado = "Código não implementado";
        return resultado;
    }
}
