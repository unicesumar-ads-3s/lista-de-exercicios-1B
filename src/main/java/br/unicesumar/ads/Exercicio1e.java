package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    public String run() {
       Scanner teclado = new Scanner(System.in);
       
       float K = 0;
       float C, F;
       
        System.out.println(" Informe sua temperatura em graus Fahrenheit ");
        F = teclado.nextFloat();
        String strk = String.format("%.1f",K);
        C = ((F - 32 )* 5)/9;
        K = (float) (C + 273.15);
        System.out.println("Kelvin "+K);

        String resultado = "Temperatura de Fahrenheit para Kelvin: "+K;
        return resultado;
    }
}
