package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
    @Override
    double fahrenheit;

    public String run() {

      Scanner scan = new Scanner(System.in);

      fahrenheit = scan.nextDouble();

      Exercicio1d.convertTemp(
        Exercicio1c.convertTemp(fahrenheit);
      );

    }
}
