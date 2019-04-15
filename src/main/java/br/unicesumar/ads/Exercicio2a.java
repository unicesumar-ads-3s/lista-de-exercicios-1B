package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public double maior;
            public double menor;
    private double result;
    public String run() {
        Scanner sann = new Scanner(System.in);
        System.out.println("insira o maior valor");
        maior = scann.nextDouble();
        System.out.println("insira o menor valor");
        menor = scann.nextDouble();

        return String.valueOf(getResult());
    }


    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = maior - menor;
    }
}
