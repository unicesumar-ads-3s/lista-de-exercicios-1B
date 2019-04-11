package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2e implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        String resultado = "Código não implementado";

        int vlr1;
        int vlr2;
        int vlr3;
        int vlr4;

        Scanner teclado=new Scanner(System.in);
       System.out.println("Divisiveis por 2 e 3\n");

       System.out.println("digite o primeiro numero\n");
        vlr1=teclado.nextInt();

        System.out.println("digite o segundo numero\n");
        vlr2=teclado.nextInt();

        System.out.println("digite o terceiro numero\n");
        vlr3=teclado.nextInt();

        System.out.println("digite o quarto numero\n");
        vlr4=teclado.nextInt();

        if((vlr1/2)==0 && (vlr1/3)==0)
        {
            System.out.println("o valor"+vlr1+" e divisivel pelos dois");
        }

        else if((vlr2/2)==0 && (vlr2/3)==0)
        {
            System.out.println("o valor e"+vlr2+" divisivel pelos dois");
        }

        else if((vlr3/2)==0 && (vlr3/3)==0)
        {
            System.out.println("o valor"+vlr3+" e divisivel pelos dois");
        }

        else if((vlr4/2)==0 && (vlr4/3)==0)
        {
            System.out.println("o valor"+vlr4+" e divisivel pelos dois");
        }

        String resultado = "Código não implementado";
        return resultado;
    }
}
