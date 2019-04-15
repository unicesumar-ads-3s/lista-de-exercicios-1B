package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    public String run() {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numeor positivo ou negativo: ");
        int N1 = in.nextInt();
        int VALOR;

        if (N1<0){
            VALOR = N1 * (-1);
        }
        else {
            VALOR = N1;
        }

        String resultado = "O numero digitado é " + VALOR;

        return resultado;
    }
}
