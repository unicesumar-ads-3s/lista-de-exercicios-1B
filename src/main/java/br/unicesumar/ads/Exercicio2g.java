package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {

    int value;
    public String run() {
        String result ;
        Scanner scann = new Scanner(System.in);

        result = "";
        value = scann.nextInt();

        if (value > 0 && value < 10){
            result = "O valor esta na faixa permitida";
        }else {
            result = "O valor esta fora da faixa permitida";
        }

        return result;

    }
}
