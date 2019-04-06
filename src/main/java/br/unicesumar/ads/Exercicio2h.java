package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2h implements InterfaceExercicio {
    @Override
    public String run() {
        Scanner teclado = new Scanner (System.in);
        int n1,n2,n3,n4,n5;
        
        System.out.println(" MAIOR E MENOR");
        System.out.println("Informe um número");
        n1 = teclado.nextInt();
        System.out.println("Informe um número");
        n2 = teclado.nextInt();
        System.out.println("Informe um número");
        n3 = teclado.nextInt();
        System.out.println("Informe um número");
        n4 = teclado.nextInt();
        System.out.println("Informe um número");
        n5 = teclado.nextInt();
        
        if((n1>=n2)&&(n1>=n3)&&(n1>=n4)&&(n1>=n5)){
            System.out.println(" Maior "+n1);
        }
        else if((n2>=n1)&&(n2>=n3)&&(n2>=n4)&&(n2>=n5)){
            System.out.println(" Maior "+n2);
        }
        else if((n3>=n1)&&(n3>=n2)&&(n3>=n4)&&(n3>=n5)){
            System.out.println(" Maior"+n3);
        }
        else if((n4>=n1)&&(n4>=n2)&&(n4>=n3)&&(n4>=n5)){
            System.out.println(" Maior "+n4);
        }
        else if((n5>=n1)&&(n5>=n2)&&(n5>=n3)&&(n5>=n4)){
            System.out.println(" Maior "+n5);
        }
        
        if((n1<=n2)&&(n1<=n3)&&(n1<=n4)&&(n1<=n5)){
            System.out.println(" Menor "+n1);
        }
        else if((n2<=n1)&&(n2<=n3)&&(n2<=n4)&&(n2<=n5)){
            System.out.println(" Menor "+n2);
        }
        else if((n3<=n1)&&(n3<=n2)&&(n3<=n4)&&(n3<=n5)){
            System.out.println(" Menor "+n3);
        }
        else if((n4<=n1)&&(n4<=n2)&&(n4<=n3)&&(n4<=n5)){
            System.out.println(" Menor "+n4);
        }
        else if((n5<=n1)&&(n5<=n2)&&(n5<=n3)&&(n5<=n4)){
            System.out.println(" Menor "+n5);
        }
        return null;
    }
}
