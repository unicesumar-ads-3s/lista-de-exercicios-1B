package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public String run() {
        int n1 = 0;
        int n2 = 0;
        int result = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");  
        n1 = ler.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = ler.nextInt();
        if(n1 > n2){
            result = n1-n2;         
        }
        else{
            result = n2-n1;
        }

        String resultado = "Diferença: " + result;
        return resultado;
    }
}
