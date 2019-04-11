package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    Integer celsius;
    
    public String convert (double celsius) {
        double result = (9*celsius+160)/5;
        return Double.toString(result);
    }
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual eh a temperatura em celsius?");
        this.celsius = scanner.nextInt();


        String resultado = this.convert(this.celsius);
        return resultado;
    }
}
