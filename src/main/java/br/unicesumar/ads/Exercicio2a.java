package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        int val1,val2,dif;
        // val1 = primeiro valor
        // val2 = segundo valor
        // dif = diferença dos 2
        Scanner teclado = new Scanner(System.in);
        System.out.println("este programa ira calcular a diferença\nde 2 numeros inteiros que voce\ninformar");
        System.out.println("digite o primeiro valor");
        val1 = teclado.nextInt();
        System.out.println("digite o segundo valor");
        val2 = teclado.nextInt();
        // o usuario fornece os 2 valores

        //verificando qual é maior para fazer a conta
        if(val1>val2) {
            //conta para se o primeiro valor for maior

            dif = val1 - val2;
            String strdif = String.format("%d",dif);
            System.out.println("O primeiro valor informado é maior");
            System.out.println("a diferença do primeiro valor\npara o segundo é "+strdif);

        }else if(val2<val1){
            //conta para se o segundo valor for maior

            dif = val2 - val1;
            String strdif = String.format("%d",dif);
            System.out.println("O segundo valor informado é maior");
            System.out.println("a diferença do segundo valor\npara o primeiro é "+strdif);

        }else{
       // caso os 2 valores sejam iguais, o programa retorna essa mensagem

            System.out.println("os valores são iguais");
    }


    }
}
