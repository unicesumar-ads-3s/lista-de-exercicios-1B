package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
    @Override
    public String run() {
        double c = 0;
        double k = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digte uma temperatura em Celsius: ");         
        c = ler.nextDouble();
        k = c + 273.15;
        //System.out.println("Temperatura em kelvin: " + k);

        String resultado = "Temperatura em kelvin: " + k;
        return resultado;
    }
}
