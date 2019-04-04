package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2e implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner(System.in);
        int val1, val2, val3, val4;


        System.out.println("Neste programa você digitará 4 valores e o programa\nirá mostrar quais deles são divisiveis\npor 2 e por 3");
        System.out.println("Informe o primeiro valor");
        val1 = teclado.nextInt();
        System.out.println("Informe o segundo valor");
        val2 = teclado.nextInt();
        System.out.println("Informe o terceiro valor");
        val3 = teclado.nextInt();
        System.out.println("Informe o quarto valor");
        val4 = teclado.nextInt();

        String strval1 = String.format("%d",val1);
        String strval2 = String.format("%d",val2);
        String strval3 = String.format("%d",val3);
        String strval4 = String.format("%d",val4);

        if((val1 % 2 == 0)&&(val1 % 3 ==0)){
            System.out.println(" "+strval1);
        }

        if((val2 % 2 == 0)&&(val2 % 3 ==0)){
        System.out.println(" "+strval2);
        }

        if((val3 % 2 == 0)&&(val3 % 3 ==0)){
        System.out.println(" "+strval3);
        }

        if((val4 % 2 == 0)&&(val4 % 3 ==0)){
        System.out.println(" "+strval4);
        }

        System.out.println("estes são os valors divisiveis por 2 e 3!!");

    }
}
