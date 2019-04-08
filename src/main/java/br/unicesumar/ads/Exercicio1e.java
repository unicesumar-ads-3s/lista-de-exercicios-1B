package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    public String run() {
         float  GCel;
        float GFah;
        float GKel;
        
        Scanner teclado=new Scanner(System.in);//instancia o método scanner
        System.out.println("digite um valor em Graus Fahrenheit");
        GFah=teclado.nextFloat();//a variavel e m questao recebe um novo valor digitado de Fahrenheit
        
        GCel=((GFah-32)*5)/9;//aqui faz o calculo , onde Graus Celsius recebe o valor convertido de graus Fahrenheit para celsius
        
        
        GKel=(float) (GCel+273.15); //aqui faz o calculo , onde Graus Kelvin recebe o valor convertido de graus Celsius para Kelvin



        String resultado = "O Resultado da conversao  Graus  Fahrenheit em Kelvin é:"+GKel ;
        return resultado;
    }
}
