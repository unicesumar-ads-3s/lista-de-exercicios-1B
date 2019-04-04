package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2i implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        int num;
        Scanner teclado = new Scanner (System.in);
        System.out.println("este programa ira verificar se o numero que você digitar é par ou impar");

        System.out.println("Digite um numero");
        num = teclado.nextInt();

        String strnum=String.format("%d",num);

        if(num % 2 == 0) {
            System.out.println("o numero "+strnum+" é par");
        }else{
            System.out.println("o numero "+strnum+" é impar");
        }

    }
}
