package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2e implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = in.nextInt();

        System.out.print("Numero 2: ");
        int n2 = in.nextInt();

        System.out.print("Numero 3: ");
        int n3 = in.nextInt();

        System.out.print("Numero 4: ");
        int n4 = in.nextInt();

        String resultado = "";
        if (n1 % 2 == 0 && n1 % 3 == 0){
            resultado += n1;
        }
        if (n2 % 2 == 0 && n2 % 3 == 0){
            resultado += n2;
        }
        if (n3 % 2 == 0 && n3 % 3 == 0){
            resultado += n3;
        }
        if (n4 % 2 == 0 && n4 % 3 == 0){
            resultado += n4;
        }

        return resultado;
    }
}
