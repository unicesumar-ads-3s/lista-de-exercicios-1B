package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner teclado = new Scanner(System.in);
       float nota1, nota2, nota3, nota4;
       float media;
        
       System.out.println(" CALCULAR MÉDIA ");
        System.out.println("Informe a primeira nota:");
        nota1 = teclado.nextFloat();
        System.out.println("Informe a primeira nota:");
        nota2 = teclado.nextFloat();
        System.out.println("Informe a primeira nota:");
        nota3 = teclado.nextFloat();
        System.out.println("Informe a primeira nota:");
        nota4 = teclado.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        String strm = String.format("%.2"+media);
        
        if(media >= 6){
            System.out.println("ALUNO APROVADO \n Média: "+strm);
        }
        else{
            System.out.println("ALUNO REPROVADO \n Média: "+strm);
        }
        return null;
    }
}
