package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1b implements InterfaceExercicio {
    Integer celsius;
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner scanner = new Scanner(System.in);
        Exercicio1b app = new Exercicio1b();

        System.out.println("Qual eh a temperatura?");
        app.celsius = scanner.nextInt();


        String resultado = "Código não implementado";
        return resultado;
    }
}
