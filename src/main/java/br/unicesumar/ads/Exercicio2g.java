package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2g implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Este programa ira verificar se o numero que voce digitou está entre 1 e 9");
        System.out.println("Digite um numero qualquer:");
        num = teclado.nextInt();

        if((num>=1)&&(num<=9)){
            System.out.println("O valor está na faixa permitida");
        }else{
            System.out.println("O valor está fora da faixa permitida");
        }

    }
}
