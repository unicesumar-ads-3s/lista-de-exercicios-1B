package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Tempo gasto na viagem: ");
        int temp = in.nextInt();
        System.out.print("Velocidade Media: ");
        int velocidade = in.nextInt();

        int dist = temp * velocidade;
        int litros_usados = dist/12;

        String resultado = "A quantidade de litros utilizada é " + litros_usados + "L";
        return resultado;
    }
}
