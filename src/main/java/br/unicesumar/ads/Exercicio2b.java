package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    public String run() {
       int num;
       int numt;
       Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
       System.out.println("MOSTRA COMO POSITIVO\n");
        System.out.println("digite algum numero\n");
        num=teclado.nextInt();//le o numero 
        
        if(num<0)//se o numero digitado for menor que zero 
        {
            numt=num*-1;//entao faz um simples calculo para transforma-lo em positivo multiplica-se por -1
        }
        else
        {
            numt=num; //se nao somente repete-se o numero
        }
        

        String resultado = "O resultado e "+numt;
        return resultado;
    }
}
