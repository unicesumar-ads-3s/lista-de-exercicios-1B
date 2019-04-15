package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    private int number;
    public String run() {
        Scanner  scann = new Scanner(System.in);
        System.out.println("coloque o valor a ser convertido");
        number = scann.nextInt();
        return String.valueOf(getNumber());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number<0) {
            this.number = number * (-1);
        }else {
            this.number = number;
        }

    }
}
