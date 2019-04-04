package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
    Scanner in = new Scanner(System.in);
        System.out.println("Digite o tempo gasto na viagem em horas: ");
        int tempo = in.nextInt();
        System.out.println("Digite a velocidade media durante a viagem em KM/H: ");
        int velocidade = in.nextInt();

        int distancia = tempo + velocidade;    

        int litros_usados = (distancia / 12);


        String resultado = "A velocidade media foi de " + velocidade + " a disttancia de " + distancia + " a quantidade de litros foi " + litros_usados;
        return resultado;
    }
}
