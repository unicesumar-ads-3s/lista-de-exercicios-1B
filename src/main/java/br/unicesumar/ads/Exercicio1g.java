package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        final float PI=(float) 3.141592653589793;//declaração de constante e algumas variaveis
        float raio;
        float area;
        float Vol;
        
        
        Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
        System.out.println("Calcula VOLUME\n ");
        System.out.println("digite o raio do galão\n");
        raio=teclado.nextFloat();//le entrada de raio
        System.out.println("\ndigite a area do galão\n");
        area=teclado.nextFloat();//le entrada de area
        
        raio=(float) Math.pow(raio, 2);//aqui usa uma função para voltar a potencia de raio^2

        Vol=PI*raio*area;//aqui pega a constante vezes o raio^2 vezes a area e retorna o volume
        
        
           
       
        String resultado = "O Volume do galão é:"+Vol;
        return resultado;
    }
}
