package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    public String run() {
        double f = 0;
        double c = 0;
        double k = 0;
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite uma temperatura em fahreinheit: ");
        f = ler.nextDouble();
        c = (( f - 32 ) * 5) / 9;
        k = c + 273.15;
       

        String resultado = "Temperatura em kelvin: " + k;
        return resultado;
    }
}
