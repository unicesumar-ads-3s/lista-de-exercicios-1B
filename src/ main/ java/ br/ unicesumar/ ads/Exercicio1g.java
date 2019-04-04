package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
       float raio, area, volume;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println(" CALCULAR VOLUME ");
        System.out.println(" Informe o Raio do cilindro:");
        raio = teclado.nextFloat();
        System.out.println(" Informe a Área do cilindro:");
        area = teclado.nextFloat();
        
        volume = (float) (Math.PI /(2*area));
        String strV = String.format("%.2f", volume);

        /* 
        Resultado apresentado é o volume do cilindro conforme os valores 
        de raio e volume apresentados pelo usuário.
        */
        String resultado = "Volume do Galão é "+strV;
        return resultado;
    }
}
