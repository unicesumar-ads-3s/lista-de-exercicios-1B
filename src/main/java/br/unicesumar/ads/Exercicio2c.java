package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    Float n1, n2, n3, n4, media;
    
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1");
        this.n1 = scanner.nextFloat();
        System.out.println("Nota 2");
        this.n2 = scanner.nextFloat();
        System.out.println("Nota 3");
        this.n3 = scanner.nextFloat();
        System.out.println("Nota 4");
        this.n4 = scanner.nextFloat();
        
        this.media = (this.n1 + this.n2 + this.n3 + this.n4) / 4;
        
        if(this.media < 6.0){
            String resultado = "Reprovado, a media eh: " + this.media;
            return resultado;
        } else {
            String resultado = "Aprovado, a media eh: " + this.media;
            return resultado;
        }


        
    }
}
