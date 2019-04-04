package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner teclado = new Scanner(System.in);
       float C, F;
       
        System.out.println(" Informe sua temperatura em graus Celsius ");
        C = teclado.nextFloat();
        F = ( 9 * C + 160 )/5;
        String resultado = "Sua temperatura em Graus Fahrenheit foi: "+F;
        return resultado;
    }
}
