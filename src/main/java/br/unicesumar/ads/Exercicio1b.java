package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    double celcius;
    double fahrenheit;
    
    public String run() {
        Scanner scan = new Scanner(System.in);
        
        celcius = scan.nextDouble();
        
        convertTemp();



        String resultado = "Código não implementado";
        return resultado;
        
        public double convertTemp(){
            fahrenheit = (9* celcius+160)/5;
                    return fahrenheit;
        }
    }
}
