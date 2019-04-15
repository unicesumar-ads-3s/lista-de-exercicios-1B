package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {

    @Override

    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

        Scanner in = new Scanner(System.in);
        System.out.print("Entre com o tempo gasto: ");
        int tempo = in.nextInt();
        System.out.print("Entre com a velocidade média: ");
        int velocidade = in.nextInt();

        int distancia = tempo * velocidade;
        String resultado = "A distancia total é: " + distancia;
        return resultado;
    }
}
