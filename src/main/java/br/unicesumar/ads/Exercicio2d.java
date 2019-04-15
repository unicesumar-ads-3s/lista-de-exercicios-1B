package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2d implements InterfaceExercicio {
    @Override

    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = in.nextInt();

        System.out.print("Numero 2: ");
        int n2 = in.nextInt();

        System.out.print("Numero 3: ");
        int n3 = in.nextInt();


        String resultado = "";
        if((n1 < n2 && n1 < n3)){
            if(n2 < n3)
                resultado += n1 + " " + n2 + " " + n3;
            else
                resultado += n1 + " " + n3 + " " + n2;
        }
        else if((n2 < n1 && n2 < n3)){
            if(n1 < n3)
                resultado += n2 + " " + n1 + " " + n3;
            else
                resultado += n2 + " " + n3 + " " + n1;
        }
        else if((n3 < n1 && n3 < n2)){
            if(n1 < n2)
                resultado += n3 + " " + n1 + " " + n2;
            else
                resultado += n3 + " " + n2 + " " + n1;
        }

        return resultado;
    }
}
