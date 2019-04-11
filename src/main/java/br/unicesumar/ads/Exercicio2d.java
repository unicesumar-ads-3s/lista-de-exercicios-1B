package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2d implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner teclado = new Scanner (System.in);
        int n1, n2, n3;
        
        System.out.println(" ORDEM CRESCENTE DE 3 VALORES");
        System.out.println("Digite um numero inteiro");
        n1 = teclado.nextInt();
        System.out.println("Digite um numero inteiro");
        n2 = teclado.nextInt();
        System.out.println("Digite um numero inteiro");
        n3 = teclado.nextInt();


    if((n1<n2)&&(n2<n3)){
        System.out.println("A ordem crescente é: "+n1+" "+n2+" "+n3);
    }
    else if ((n2<n1)&&(n1<n3)){
        System.out.println("A ordem crescente é: "+n2+" "+n1+" "+n3);
    }
    else if ((n3<n1)&&(n1<n2)){
        System.out.println("A ordem crescente é: "+n3+" "+n1+" "+n2);
    }
    else if ((n3<n2)&&(n2<n1)){
        System.out.println("A ordem crescente é: "+n3+" "+n2+" "+n1);
    }
    else if ((n2<n3)&&(n3<n1)){
        System.out.println("A ordem crescente é: "+n2+" "+n3+" "+n1);
    }
    else if ((n1<n3)&&(n3<n2)){
        System.out.println("A ordem crescente é: "+n1+" "+n3+" "+n2);
    }
        return null;
    }
}

