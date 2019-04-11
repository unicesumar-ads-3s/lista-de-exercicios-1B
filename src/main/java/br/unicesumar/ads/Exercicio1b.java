package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
       	double c = 0;
        double f = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digte uma temperatura em Celsius: ");         
        c = ler.nextDouble();
        f = ( 9 * c + 160 ) / 5;
        //System.out.println("Temperatura em fahreinheit; " + f);
	String resultado = "Temperatura em fahreinheit: " + f;
	return resultado;



 
    }
}
