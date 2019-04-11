package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio3a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        double pi = 0.0, div = 1, erro=9999;
        double pi_ant;
        int i=0;
        
        System.out.println("Este programa calcula o pi com diferença menor que 0.000001\n");
        
        do{
            pi_ant = pi;
            if(i % 2 == 0 ){
                pi += (4.0 / div);
            }else{
                pi -= 4.0 / div;
            }
            div = div+2;
            i = i+1;
            erro = abs(pi - pi_ant);
        }while(erro > 0.00001);
        
        String stri = String.format("%d",i);
        String strpi = String.format("%.6f",pi);
        
        System.out.println("a quantidade de interações necessarias foi: "+stri);
        System.out.println(""+strpi);
        
        
        return strpi;
    }
}
