package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1e implements InterfaceExercicio {
     public static float celsius;
     public static float kelvin;
     public static float fahrenheit;
     Scanner scanf = new Scanner(System.in);

    public Exercicio1e() {
    }
    
     
    
    @Override
    public String run() {
        System.out.println("Digite a Temperatura em Fanrenheit: ");
        this.fahrenheit = scanf.nextFloat();
        
        this.celsius = ((this.fahrenheit-32) * 5)/9;
        this.kelvin = (this.celsius + 273.15f);



        String resultado = "Temperatura em Fanrenheit: "+this.fahrenheit+" Temperatura em kelvin: "+this.kelvin;
        return resultado;
    }
}
