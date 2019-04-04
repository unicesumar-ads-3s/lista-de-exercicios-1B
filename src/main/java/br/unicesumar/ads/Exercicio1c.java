package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado = new Scanner(System.in);
        float C, F;

        System.out.println(" Digite a sua temperatura em graus Fahrencheit:");
        F = teclado.nextFloat();
        C =((F - 32)* 5)/9;
        String strC = String.format("%.1f",C);

        System.out.println("Celsius "+strC);




        String strC = "Sua temperatura em graus Celsius é: ";
        return strC;
    }
}
