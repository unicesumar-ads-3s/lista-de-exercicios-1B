package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        int num1;
        int num2;
        int resu;

        Scanner teclado=new Scanner(System.in);
        System.out.println("VER A DIFERENÇA\n");
        System.out.println("Digite o primeiro numero\n");
        num1=teclado.nextInt();

        System.out.println("Digite o segundo numero\n");
        num2=teclado.nextInt();

        if(num1>num2)
        {
            resu=num1-num2;
        }
        else
        {
            resu=num2-num1;
        }
        String resultado = "Código não implementado";
        return resultado;
    }
}
