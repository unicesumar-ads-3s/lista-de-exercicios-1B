package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner teclado = new Scanner(System.in);
       
       float C, F;
       
        System.out.println(" Informe sua temperatura em graus Fahrencheit ");
        F = teclado.nextFloat();
        C = ((F - 32 )* 5)/9;
        String strC = String.format("%.1f",C);
        
        String resultado = "Temperatura em graus Celsius é "+strC;
        return resultado;
    }
}
