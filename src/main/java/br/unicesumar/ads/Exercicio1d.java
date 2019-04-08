package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
    @Override
    public String run() {
        
        float  GCel;
        float GKel;
        
        Scanner teclado=new Scanner(System.in);//instancia o método scanner
        System.out.println("digite um valor em Graus Celsius");
        GCel=teclado.nextFloat();//a variavel e m questao recebe um novo valor digitado de Celsius
        
        GKel=(float) (GCel+273.15); //aqui faz o calculo , onde Graus Kelvin recebe o valor convertido de graus Celsius para Kelvin




        String resultado = "O resultado em Kelvin é"+GKel;
        return resultado;
    }
}
