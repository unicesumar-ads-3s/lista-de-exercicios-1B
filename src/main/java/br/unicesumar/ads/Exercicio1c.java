package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
  double celcius;
  double fahrenheit;

    public String run() {
      Scanner scan = new Scanner(System.in);

      fahrenheit = scan.nextDouble();

      convertTemp(fahrenheit);
      return null;
    }
    public double convertTemp(fahrenheit){
      celcius  = ((fahrenheit -32)*5)/5;
        System.out.printLn(celcius)
                return celcius;
    }
}
