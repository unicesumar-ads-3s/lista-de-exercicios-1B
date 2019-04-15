package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2h implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        int n;
        int maior = 0;
        int menor = 9999;

        for(int i = 1; i < 6; i++) {
            System.out.print("Numero " + i + ":");
            n = in.nextInt();

            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }


        String resultado = "Maior valor:" + maior + "| Menor Valor:" + menor;
        return resultado;
    }
}
