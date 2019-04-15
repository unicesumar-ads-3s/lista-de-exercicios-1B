package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    public String run() {
        int n = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero positivo ou negativo: ");
        n= ler.nextInt();
        if(n<0){
        n = n*-1;
        }
        



        String resultado = "resultado " + n;
        return resultado;
    }
}
