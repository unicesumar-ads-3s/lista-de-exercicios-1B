package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        final double PI = 3.141592653589793;
        double a = 0;
        double r = 0;
        double v = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a area: ");
        a = ler.nextDouble();
        System.out.println("Digite o raio: ");
        r = ler.nextDouble();
        v = PI * r * 2 * a;


        String resultado = "Volume: " + v;
        return resultado;
    }
}
