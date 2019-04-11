package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1d implements InterfaceExercicio {
    Integer celsius;
    
    public String convert (double celsius) {
        double result = celsius + 273.15;
        return Double.toString(result);
    }
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual eh a temperatura em kelvin?");
        this.celsius = scanner.nextInt();




        String resultado = this.convert(this.celsius);
        return resultado;
    }
}
