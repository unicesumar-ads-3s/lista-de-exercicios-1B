package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    Scanner scanf = new Scanner(System.in);
    static String resultado;
    static float nota1;
    static float nota2;
    static float nota3;
    static float nota4;
    static float media;

    public Exercicio2c() {
    }
    
    
    
    @Override
    public String run() {
        
        System.out.println("Digite a 1º nota: ");
        nota1 = scanf.nextFloat();
        System.out.println("Digite a 2º nota: ");
        nota2 = scanf.nextFloat();
        System.out.println("Digite a 3º nota: ");
        nota3 = scanf.nextFloat();
        System.out.println("Digite a 4º nota: ");
        nota4 = scanf.nextFloat();
        
        media = (nota1+nota2+nota3+nota4)/4;
        if(media >= 6){
            resultado = "Aluno Aprovado, com media de: "+media;
        }
 
            
        return resultado;
    }
}
