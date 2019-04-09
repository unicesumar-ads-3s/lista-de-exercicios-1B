package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    double litros_usados;
    double distancia;
    double tempo;
    double velocidade;

    public String run() {



        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque quanto tempo demorou: ");
        tempo = scan.nextFloat();
        System.out.println("Coloque a sua velocidade: ");
        velocidade = scan.nextFloat();

        getDistancia();
        litrosUsado();

        String resultado = "Código não implementado";
        return resultado;
    }

    public double getDistancia(){
        distancia = tempo * velocidade;
        System.out.println("A distancia percorrida foi: " + distancia);
        return distancia;
    };

    public double litrosUsado(){
        litros_usados = distancia/12;
        System.out.println("A distancia percorrida foi: " + litros_usados);
        return litros_usados;
    };

}
