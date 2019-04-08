package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
          float  GCel;
        float GFah;
        
        Scanner teclado=new Scanner(System.in);//instancia o método scanner
        System.out.println("digite um valor em Graus Celsius");
        GCel=teclado.nextFloat();//a variavel e m questao recebe um novo valor digitado de Celsius
        GFah=(9*GCel+160)/5;//aqui a variavel recebe o valor convertido de Celsius para Fahrenheit
        
        
       
        
        String resultado="o valor convertido em Fahrenheit é:"+GFah;
        return resultado;
    }
}
