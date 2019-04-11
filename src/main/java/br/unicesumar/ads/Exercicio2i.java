package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2i implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        String resu;
        int num;

         Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
        System.out.println("Mostrar se e PAR ou IMPAR\n");

        System.out.println("digite um numero \n");
        num=teclado.nextInt();

       if((num  % 2) == 0)
          resu=" par";
       else
          resu=" impar";

        String resultado = "Código não implementado";
        return resultado;
    }
}
