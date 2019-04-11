package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

        Scanner in = new Scanner(System.in)
        System.out.print("Entre com o valor do raio: ");
        int raio = in.nextInt();
        System.out.print("Entre com o valor da área: ");
        int area = in.nextInt();

        double V = 3.141592653589793*(raio*raio)*area;

        String resultado = "O volume do galão é: " + V;
        return resultado;


       
    }
}
