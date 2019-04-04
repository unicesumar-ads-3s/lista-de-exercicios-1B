package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
    @Override
    public String run() {
       Scanner teclado = new Scanner(System.in);
       
       float K, C;
       
        System.out.println(" Informe sua temperatura em graus Celsius ");
        C = teclado.nextFloat();
        K = (float) (C + 273.15);
        String strK = String.format("%.2f",K);
       
        String resultado = "Temperatura em graus Kelvin foi: "+strK;
        return resultado;
    }
}
