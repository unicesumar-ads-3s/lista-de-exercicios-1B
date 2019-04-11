package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    Integer speed;   
    Integer duration;
    double distance;
    
    public double dist(Integer duration, Integer speed) {
        double distancia = duration * speed;
        return distancia;
    }
    
    public String litrosUsados (double distancia) {
        double result = distancia / 12;
        return Double.toString(result);
    }
    
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual foi a duracao?");
        this.duration = scanner.nextInt();
        System.out.println("Qual foi a velocidade media?");
        this.speed = scanner.nextInt();
        
        this.distance = this.dist(this.duration, this.speed);
        

        return "Litros Usados " + this.litrosUsados(this.distance);
    }
}
