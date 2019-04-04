package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2a implements InterfaceExercicio {
    @Override
    public String run() {
     int n1,n2, diferenca;
        String resultado;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println(" Diferença entre dois Valores inteiros");
        System.out.println("Digite um numero qualquer:");
        n1 = teclado.nextInt();
        System.out.println("Digie outro número qualquer:");
        n2 = teclado.nextInt();
        
        if(n1>n2){
            diferenca = n1 - n2;
            resultado = " A diferencça entre "+n1+" e "+n2+"= "+diferenca;
        }
        else if(n2>n1){
            diferenca = n2 - n1;
            resultado = " A diferencça entre "+n1+" e "+n2+"= "+diferenca;
        }
        //CASO VALORES IGUAIS
        else {
            resultado = "Não existe diferença entre os valores apresentados";
        }
        return resultado;
}
