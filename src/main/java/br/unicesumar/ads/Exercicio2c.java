package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double  N1 = in.nextDouble();

        System.out.print("Nota 2: ");
        double  N2 = in.nextDouble();

        System.out.print("Nota 3: ");
        double  N3 = in.nextDouble();

        System.out.print("Nota 4: ");
        double  N4 = in.nextDouble();

        Double MEDIA = (N1+N2+N3+N4)/4;


        if (MEDIA>=6){
            String resultado = "O aluno foi aprovado com media " + MEDIA;
            return resultado;
        }
        else{
            String resultado = "O aluno não foi aprovado com media " + MEDIA;
            return resultado;
        }
    }
}
