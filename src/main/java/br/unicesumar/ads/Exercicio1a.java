package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner tecla = new Scanner (System.in);
             float dis, vel, tem, litr;

              System.out.println("Digite o tempo da viagem");
              tem = tecla.nextFloat();
              System.out.println("Digite a distacia da viagem");
              dis = tecla.nextFloat();

              vel= dis/tem;

              System.out.println("Velocidade Media:  "+vel);

              litr=dis/12;
              System.out.println("Litro Usado: "+litr);
        String resultado = "Código não implementado";
        return resultado;
    }
}
