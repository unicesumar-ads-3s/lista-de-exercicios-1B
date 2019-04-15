package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio3a implements InterfaceExercicio {
    @Override
    public String run() {
        double PI = 0.0, d = 1, diferenca=9999;
        int i = 0;
        double pia;
        
        
        System.out.println("Programa calcula o valor de PI com diferença igual a 0.000001\n");
        
        do{
            pia = PI;
            if(i % 2 == 0 ){
                PI += (4.0 / d);
            }else{
                PI -= 4.0 / d;
            }
            d = d+2;
            i = i+1;
            diferenca = abs(PI - pia);
        }while(diferenca > 0.00001);
        
        String stri = String.format("%d",i);
        String strPI = String.format("%.4f",PI);
        
        System.out.println("Foram necessárias: "+stri+" interações.");
        System.out.println(""+strPI);
        
        return strPI;
    }
}
