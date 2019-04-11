package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1c implements InterfaceExercicio {
    
    Integer farenheit;
    
    public String convert (double farenheit) {
        double result = ((farenheit-32)*5)/9;
        return Double.toString(result);
    }
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual eh a temperatura em farenheit?");
        this.farenheit = scanner.nextInt();


        String resultado = this.convert(this.farenheit);
        return resultado;
    }
}
