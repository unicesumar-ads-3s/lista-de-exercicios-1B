package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {

    Scanner scanf = new Scanner(System.in);
    public static float distancia;
    public static float tempoGasto;
    public static float velocidadeMedia;
    public static float listrosUsados;
    
    //construtor
    public Exercicio1a() {
    }
    
    
    
    @Override
    public String run() {

        System.out.println("Digite o tempo gasto na viagem, seguindo o padrao 'HH,MM'");
        this.tempoGasto = (scanf.nextFloat());         
        System.out.println("Digite a velocidade média usado na viagem");
        this.velocidadeMedia = (scanf.nextFloat());

        this.distancia = this.tempoGasto * this.velocidadeMedia;
        this.listrosUsados = this.distancia / 12;



        String resultado ="Velocidade média:  "+this.velocidadeMedia + "  Distancia Percorrida: "+this.distancia+"  Tempo Gasto:  "+this.tempoGasto+"  Combustivel Usado: " + this.listrosUsados;
        
        return resultado;
    }
}
