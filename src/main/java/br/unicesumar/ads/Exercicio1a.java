package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    Integer speed;   
    Integer duration;
    double distance;
    
    public double dist(Integer duration, Integer speed) {
        double distancia = this.duration * this.speed;
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
        Exercicio1a app = new Exercicio1a();
        
        System.out.println("Qual foi a duracao?");
        app.duration = scanner.nextInt();
        System.out.println("Qual foi a velocidade media?");
        app.speed = scanner.nextInt();
        
        app.distance = app.dist(app.duration, app.speed);
        

        return "Litros Usados " + app.litrosUsados(app.distance);
    }
}
