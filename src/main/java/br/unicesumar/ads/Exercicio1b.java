package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Celsius: ");
        double celsius = in.nextInt();
        
        Double F = (9*celsius+160)/5;

        String resultado = "A temperatura em fahrenheit é: " + F;
        return resultado;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;
import java.util.Scanner;
/**
 *
 * @author UniCesumar
 */
public class Exercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
double Celsius, Fahrenheit;
System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");
System.out.print("Digite a temperatura em Celsius: ");
Celsius = entrada.nextDouble();
Fahrenheit = ( 9 * Celsius + 160 ) / 5;
System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
}
}// TODO code application logic here
   
   
}

        
    }
}
