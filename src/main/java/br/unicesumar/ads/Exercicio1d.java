package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
  double celcius;
  double kelvin;

    public String run() {
      Scanner scan = new Scanner(System.in);

      celcius = scan.nextDouble();

      convertTemp(celcius);
    }

    public double convertTemp(celcius){
      kelvin  = celcius + 273.15;
        System.out.printLn(kelvin)
                return kelvin;
    }


}
