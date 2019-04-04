package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
     
        double VeloMe;
        double TempGasto;
        double aut12;//declara variaveis
        double distancia;
        double litUsados;
        aut12=12;
        
        
        Scanner teclado=new Scanner(System.in);//instancia entrada teclado
        System.out.println("entre com o  tempo gasto ");
         TempGasto= teclado.nextDouble();//entra com novo valor de tempo
        System.out.println("entre com a velocidade media ");
        VeloMe= teclado.nextDouble();//le a velocidade media
        
        distancia=VeloMe*TempGasto;//faz calculo distancia
        
        
        litUsados=distancia/aut12;//faz calculos  de litros usados 
        System.out.println("a distancia percorrida e "+distancia);
        System.out.println("O total de litros usados "+litUsados);





String str = Double.toString(litUsados);//converte de double para string
String stri = Double.toString(distancia);



        String resultado = "Litros usados: " + litUsados + " Distancia: " + distancia;
        return resultado;
    }
}
