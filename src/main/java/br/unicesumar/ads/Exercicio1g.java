package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
   static double volume;
    static double raio;
    static double area;
    static double tt = 3.141592653589793;
    Scanner scanf = new Scanner(System.in);
    
    
    
    
    
    @Override
    public String run() {
        System.out.println("Digite o Raio do galão: ");
         this.raio = scanf.nextDouble();
             
         
        System.out.println("Digite a Area do galão: ");
        this.area = scanf.nextDouble();
        
        
        this.volume = (tt * this.raio *2 *this.area);



        String resultado = "Volume total deste galão é de: "+this.volume; 
        return resultado;
    }
}
