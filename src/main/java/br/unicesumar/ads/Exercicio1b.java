package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    public static float celsius;
    public static float fahrenheit;
    Scanner scanf = new Scanner(System.in);
   
    
    
    //contrutor 

    public Exercicio1b() {
    }
    
 
    
    @Override
    public String run() {
        
   
        //imprime resultado
        System.out.println("Digite a Temperatura em Celsius: ");
        this.celsius = scanf.nextFloat();
        this.fahrenheit = (9 * this.celsius + 160)/5;
        

        String resultado = "Temperatura em Celsius: "+this.celsius+" Temperatura em Fanrenheit: " +this.fahrenheit;
        return resultado;
    }
}
