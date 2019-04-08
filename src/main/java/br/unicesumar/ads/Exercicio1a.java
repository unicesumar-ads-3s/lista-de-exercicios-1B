package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        final int kmc12=12;//defini uma constante aqui pois o valor 12 nao muda
        float TempGasto;//declaração geral de variáveis
        float VeloMedia;
        float DistPerco;
        float LitUsados;
        
        Scanner teclado=new Scanner(System.in);//instancia o método scanner
        
        System.out.println("digite o tempo gasto de viagem");
        TempGasto=teclado.nextFloat();//a variavel e m questao recebe um novo valor digitado
        System.out.println("digite a velocidade media da viagem");
        VeloMedia=teclado.nextFloat();//a variavel e m questao recebe um novo valor digitado
        
        DistPerco=TempGasto*VeloMedia;//aqui faz o calculo da distancia
        
        LitUsados=DistPerco/kmc12;// aqui faz o calculo dos litros usados
        
        
        
        
        
        
        
        



 
        String resultado ="A velocidade media e \n"+VeloMedia+ "\nO tempo Gasto foi \n"+TempGasto+"\nA distancia Percorrida foi de\n"+DistPerco+"\nA quantidade de litros usados foi \n"+LitUsados;
        return resultado;
    }
}
