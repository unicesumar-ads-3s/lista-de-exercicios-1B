package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    Integer n1, n2, result;
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        this.n1 = scanner.nextInt();
        
        System.out.println("Digite outro numero inteiro: ");
        this.n2 = scanner.nextInt();
        
        this.result = Math.max(n1, n2) - Math.min(n1, n2);



        String resultado = "A diferença eh de: " + this.result;
        return resultado;
    }
}
