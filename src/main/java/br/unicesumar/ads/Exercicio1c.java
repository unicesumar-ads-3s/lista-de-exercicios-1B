package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    public static float celsius;
    public static float fahrenheit;
    Scanner scanf = new Scanner(System.in);

    public Exercicio1c() {
    }
    
    
    
    @Override
    public String run() {
        System.out.println("Digite a Temperatura em Fanrenheit: ");
        this.fahrenheit = scanf.nextFloat();
        this.celsius = ((this.fahrenheit-32)*5)/9;



        String resultado = "Temperatura em Fanrenheit: "+this.fahrenheit+" Temperatura em Celsius: "+this.celsius;
        return resultado;
    }
}
