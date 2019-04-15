package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2f implements InterfaceExercicio {

    int value;
    public String run() {
        Scanner scann = new Scanner(System.in);
        String result;


        for(int i=0; 1<=4; i++){
            result = "";
            System.out.println("escolha o valor");
            value = scann.nextInt();
            if ( value%2 ==0 || value%3 ==0 ) {
                result = value + " é divisivel por 2 ou 3";
            }else{
                result = value + " nao é divisivel por 2 ou 3";
            }
            return result;
        }
    }
}
