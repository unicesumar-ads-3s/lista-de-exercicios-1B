package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    float raio;
    float area;
    
    public Double calc (float raio, float area) {
        double V = 3.141592653589793* 2* area;
        return V;
    }
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual eh a raio?");
        this.raio = scanner.nextInt();
        System.out.println("Qual eh a area?");
        this.area = scanner.nextInt();




        Double resultado = this.calc(this.raio, this.area);
        return "Volume: " + resultado;
    }
}
