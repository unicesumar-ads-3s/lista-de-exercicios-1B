package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2h implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner (System.in);
        int num1, num2, num3, num4, num5, maior=-100000, menor=100000;

        System.out.println("Digite um numero qualquer");
        num1 = teclado.nextInt();
        if (num1>maior){
            maior = num1;
        }
        if (num1<menor){
            menor = num1;
        }
        System.out.println("Digite um numero qualquer");
        num2 = teclado.nextInt();
         if (num2>maior){
            maior = num2;
        }
        if (num2<menor){
            menor = num2;
        }
        System.out.println("Digite um numero qualquer");
        num3 = teclado.nextInt();
         if (num3>maior){
            maior = num3;
        }
        if (num3<menor){
            menor = num3;
        }
        System.out.println("Digite um numero qualquer");
        num4 = teclado.nextInt();
         if (num4>maior){
            maior = num4;
        }
        if (num4<menor){
            menor = num4;
        }
        System.out.println("Digite um numero qualquer");
        num5 = teclado.nextInt();
         if (num5>maior){
            maior = num5;
        }
        if (num5<menor){
            menor = num5;
        }

        String strmaior=String.format("%d",maior);
        String strmenor=String.format("%d",menor);

        System.out.println("o maior é: "+strmaior+"\ne o menor é: "+strmenor);



        String resultado = "Código não implementado";
        return resultado;
    }
}
