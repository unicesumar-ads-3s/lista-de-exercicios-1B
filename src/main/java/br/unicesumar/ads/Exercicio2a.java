package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public String run() {
        
        int num1;
        int num2;
        int result;
        
        Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
        System.out.println("VE A DIFERENÇA\n");
        System.out.println("digite o primeiro numero\n");
        num1=teclado.nextInt();//entra com o primeiro numero
        
        System.out.println("digite o segundo numero\n");
        num2=teclado.nextInt();//entra com o segundo numero
        
        
        if(num1>num2)//aqui se o primeiro numero for maior que o segundo
        {
            result=num1-num2; // o resultado recebe o primeiro numero - o segundo numero
        }
        else
        {//se nao  o resultado recebe o segundo numero - o primeiro numero
            result=num2-num1;
        }
        
        


        String resultado = "o resultado e "+result;
        return resultado;
    }
}
