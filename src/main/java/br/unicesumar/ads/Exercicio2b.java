package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
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
        
        this.result = n1-n2;
        
        if(result < 0){
            this.result = Math.abs(result);
        }


        String resultado = "Código não implementado";
        return resultado;
    }
}
