package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2f implements InterfaceExercicio {
    @Override
    public String run() {
        int n1,n2,n3,n4;
        Scanner teclado = new Scanner (System.in);
        System.out.println(" DIVISIVEIS POR 2 OU 3 ");
        System.out.println("Primeiro número: ");
        n1 = teclado.nextInt();
        System.out.println("Segundo número: ");
        n2 = teclado.nextInt();
        System.out.println("Terceiro número: ");
        n3 = teclado.nextInt();
        System.out.println("Quarto número: ");
        n4 = teclado.nextInt();
        
        if((n1%2==0)||(n1%3==0)){
            System.out.println(n1+ " Divisivel por 2 ou 3");
        }
        else if((n2%2==0)||(n2%3==0)){
            System.out.println(n2+ " Divisivel por 2 ou 3");
        }
        else if((n3%2==0)||(n3%3==0)){
            System.out.println(n3+ " Divisivel por 2 ou 3");
        }
        else if((n4%2==0)||(n4%3==0)){
            System.out.println(n4+ " Divisivel por 2 ou 3");
        }
        else {
            System.out.println("Esse número não é divisivel por 2 ou 3");
        }

          }
}
