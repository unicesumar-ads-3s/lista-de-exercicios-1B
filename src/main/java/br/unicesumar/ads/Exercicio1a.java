package br.unicesumar.ads;
import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        int tempo = 0;
        int vel = 0;
        int distancia = 0;
        float litros_usados = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas horas foram gastas na viagem? ");
        tempo = ler.nextInt();
        System.out.println("Qual a velocidade media?");
        vel = ler.nextInt();
        distancia = tempo * vel;
        litros_usados = distancia / 12;
        System.out.println("velocidade media: " + vel);
        System.out.println("Tempo gasto: " + tempo);
        System.out.println("Distancia percorrida: " + distancia);
        System.out.println("Quantidade de litros usados: " + litros_usados);

        
    }
}
