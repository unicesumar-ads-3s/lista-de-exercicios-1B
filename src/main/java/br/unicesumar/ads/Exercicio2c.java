package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    public String run() {
        double n1 = 0;
        double n2 = 0; 
        double n3 = 0;
        double n4 = 0;
        double media = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();
        System.out.println("Digite a quarta nota: ");
        n4 = ler.nextDouble();
        
        media = (n1 + n2 + n3 + n4)/4;
        String resultado;
        if(media > 6){
            resultado = "aprovado";
        }
        else{
            resultado = "reprovado";
        }




        
        return resultado;
    }
}
