package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner teclado = new Scanner(System.in);
        float distancia, tempo, velocidade, litros;
        
        
        System.out.println("  Velociade Media ");
        System.out.println("Distancia Percorrida: ");
        distancia = teclado.nextFloat();
        System.out.println("Tempo de Viagem: ");
        tempo = teclado.nextFloat();
        
        velocidade = distancia / tempo;
        litros = distancia / 12;
        String strlitros = String.format("%.2f",litros);
        String strvelocidade = String.format("%.2f",velocidade);
        




        String resultado = "Sua velocidade média foi: "+strvelocidade+" Gastos "+strlitros+" litros de combustivel";
        return resultado;
    }
}
