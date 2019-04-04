package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
     
        double VeloMe;
        double TempGasto;
        double aut12;
        double distancia;
        double litUsados;
        aut12=12;
        
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("entre com o  tempo gasto ");
         TempGasto= teclado.nextDouble();
        System.out.println("entre com a velocidade media ");
        VeloMe= teclado.nextDouble();
        
        distancia=VeloMe*TempGasto;
        
        
        litUsados=distancia/aut12;
        System.out.println("a distancia percorrida e "+distancia);
        System.out.println("O total de litros usados "+litUsados);





String str = Double.toString(litUsados);
String stri = Double.toString(distancia);



        String resultado = "Litros usados: " + litUsados + " Distancia: " + distancia;
        return resultado;
    }
}
