package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {
    @Override
    public String run() {
        final int max;//define uma constante para o valor maximo =9
        max=9;
        int vlr1;
       
       String result;
       
         Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
       System.out.println("MOSTRA SE O VALOR ESTA DENTRO DA FAIXA\n");
       
       System.out.println("digite algum valor de \n");//entra com os valores
        vlr1=teclado.nextInt();
        
        
        if(vlr1>1 && vlr1<9)
        {
            result="esta dentro da faixa";
        }
        else
        {
           result="esta fora da faixa"; 
        }
               
        
        



        String resultado = "O numero digitado "+result;
        return resultado;
    }
}
