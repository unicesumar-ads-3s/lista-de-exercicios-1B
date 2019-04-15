package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    private double media;

    public String run() {
        Scanner scann = new Scanner(System.in);

        System.out.println("intsira a nota 1");
        nota1 = scann.nextDouble();
        System.out.println("intsira a nota 2")
        nota2 = scann.nextDouble();
        System.out.println("intsira a nota 3")
        nota3 = scann.nextDouble();
        System.out.println("intsira a nota 4")
        nota4 = scann.nextDouble();

        setMedia(nota1, nota2, nota3, nota4);
        return getMedia();
    }


    public void getMedia() {

        if (media >= 6){
            System.out.println("voce foi aprovado com media: "+ media);
        }else{
            System.out.println("voce foi reprovado com media: "+ media);
        }
        return;
    }

    public void setMedia(double nota1, double nota2, double nota3, double nota4) {
        this.media = (nota1 + nota2 + nota3 + nota4)/ 4;
    }
}
