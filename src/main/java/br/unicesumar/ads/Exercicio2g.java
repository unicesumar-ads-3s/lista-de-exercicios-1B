package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        final int max;
        max=9;
        int vlr1;
                
        String result;

         Scanner teclado=new Scanner(System.in);
        System.out.println("Mostrar se o valor esta dentro da faixa\n");


        System.out.println("digite um valor de \n");
        vlr1=teclado.nextInt();

        if(vlr1>1 && vlr1<9)
        {
            result="esta dentro da faixa";
        }
        else
        {
           result="esta fora da faixa";
        }

        String resultado = "Código não implementado";
        return resultado;
    }
}
