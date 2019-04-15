package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
     public static float celsius;
     public static float kelvin;
     Scanner scanf = new Scanner(System.in);

    public Exercicio1d() {
    }
     
     
    
    
    @Override
    public String run() {
        System.out.println("Digite a Temperatura em Celsius: ");
        this.celsius = scanf.nextFloat();
        this.kelvin = (this.celsius + 273.15f);




        String resultado = "Temperatura Celsius: "+this.celsius+" Temperatura Kelvin: "+this.kelvin;
        return resultado;
    }
}
