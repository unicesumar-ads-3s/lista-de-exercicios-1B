package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2i implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero: ");
        int n1 = in.nextInt();

        String resultado = "";
        if(n1 ==0){
            resultado = "Segundo pesquisa no google o 0 é sim par";
        }
        else if (n1 % 2 == 0){
            resultado = "Par";
        }
        else{
            resultado = "Impar";
        }

        return resultado;
    }
}
