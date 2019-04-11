package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    @Override
 
    public String run() {
        double f = 0;
        double c = 0;
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite uma temperatura em fahreinheit: ");
        f = ler.nextDouble();
        c = (( f - 32 ) * 5) / 9;

        String resultado = "Temperatura em Celsius " + c;
        return resultado;
    }
}
