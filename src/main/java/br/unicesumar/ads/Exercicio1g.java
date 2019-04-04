package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        float V, R, A;
        float pi = (float) 3.141592653589793;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Este programa ira cacular o volume de acordo\ncom os valores que voce informar");
        do{
            System.out.println("informe o valor do raio em metros");
            R = teclado.nextFloat() ;
        }while(R<=0);
        do{
            System.out.println("informe o valor da area em metros:");
            A = teclado.nextFloat() ;
        }while(A<=0);
        //O usuario digitará os valores para que a conta possa ser efetuada

        V = (pi * (R*2) * A);

        String strV=String.format("%.2f",V);
        



        String strV = "O valor do seu volume é: ";
        return strV;
    }
}
