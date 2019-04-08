package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2d implements InterfaceExercicio {
    @Override
    public String run() {
        int num1;
        int num2;
        int num3;
        int p = 0,pe = 0,utl = 0;
        
       Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
       System.out.println("MOSTRA EM ORDEM CRESCENTE\n");
       
       System.out.println("digite o primeiro numero\n");//entra com os valores
        num1=teclado.nextInt();
        
        System.out.println("digite o segundo numero\n");
        num2=teclado.nextInt();
        
        System.out.println("digite o terceiro numero\n");
        num3=teclado.nextInt();
        
       
        if(num1>num2 && num1>num3)//faz a primeira verificação se o primeiro numero digitado é maior que os demmais
        {
            utl=num1;//se for ele fica como ultimo da lista
             
            
            if(num2>num3)//dentro do if se o segundo numero for maior que o terceiro entao ele sera o penultimo e o terceiro numero sera o primeiro
        {
            pe=num2;
            p=num3;
            
        }
            
        }
       
        else// se nao for o caso entao o penultimo passa a ser o o ultimo numero digitado e o primeiro passa a ser o sgundo numero digitado
        {
            pe=num3;
            p=num2;
        }
       
        
        


        String resultado = "o resultado e "+p+pe+utl+"";
        return resultado;
    }
}
