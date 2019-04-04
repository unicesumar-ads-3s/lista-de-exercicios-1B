package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
      // TODO code application logic here
      Scanner teclado = new Scanner (System.in);
      float dist, tempo, vel, lt_usados;
      // dist = distancia
      // tempo = tempo
      // vel = velocidade media
      // lt_usados = quantidade de litros usados

      System.out.println("esta calculadora vai calcular seus litros usados em sua viagem!!!\n");

      do{
          System.out.println("informe a distancia percorrida em km");
          dist= teclado.nextFloat();
      }while(dist<=0);
      //o usuario fornece a distancia, que não pode ser negativa

      do{

          System.out.println("informe o tempo de viagem em horas");
          tempo= teclado.nextFloat();
      }while(tempo<=0);
      //o usuario fornece o tempo, que não pode ser negativo


      vel = dist/tempo;
      lt_usados = dist/12;
      // aqui o programa calcula a velocidade media e a quatidade de litros usados

      String strvel=String.format("%.2f",vel);
      String strlt_usados=String.format("%.2f",lt_usados);
      // aqui o programa deixa a velocidade e a qtde de litros usados com 2 casas após a virgula

      System.out.println("sua velocidade media foi: \n"+strvel);

        String strlt_usados = "sua quantidade de litros gastos: ";
        return strlt_usados;
    }
}
