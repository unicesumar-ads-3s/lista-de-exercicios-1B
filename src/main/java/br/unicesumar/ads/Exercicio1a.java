package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
       
        
        Scanner entrada = new Scanner(System.in);
        double VelocidadeMedia, TempoGasto, Autonomia = 12;
        double Distancia, LitrosUsados;		

        System.out.print("Cálculo da quantidade de litros de combustível gasta em uma viagem\n\n");


        System.out.print("Digite o tempo que você gastou em sua viagem (horas): ");
        TempoGasto = entrada.nextDouble();

        System.out.print("Digite o Velocidade Média em que você fez o percurso (Km/h): ");
        VelocidadeMedia = entrada.nextDouble();


        Distancia = VelocidadeMedia * TempoGasto;
        LitrosUsados = Distancia / Autonomia;


        System.out.print("\n\n\nResultados:\n\n");
        System.out.print("Velocidade média = " + VelocidadeMedia + " Km/h\n");
        System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
        System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
        System.out.print("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");

        return "\n\n\nResultados:\n\n"+
         "Velocidade média = " + VelocidadeMedia + " Km/h\n" +
         "Tempo gasto = " + TempoGasto + " horas\n" +
         "Distancia Percorrida = " + Distancia + " Km\n" +
         "Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n";
       }

   }  