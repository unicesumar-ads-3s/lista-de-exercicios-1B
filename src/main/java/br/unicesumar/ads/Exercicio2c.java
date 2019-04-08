package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    public String run() {
       float n1;
       float n2;
       float n3;
       float n4;
       String bool;
        int[] vet=new int[5];//declarei um vetor para guardar os valores das notas
       float media=0;
       int i;// um indice para acessar as posições do vetor
       
       
       
       Scanner teclado=new Scanner(System.in);//chama metodo Scanner para ler entradas
       System.out.println("MOSTRA REPROVADO OU NAO \n");
       
        for(i=1;i<=4;i++)//aqui faz um loop para inserir as notas
        {
            System.out.println("digite a "+i+" nota\n");
            vet[i]=(int)teclado.nextFloat();//le cada vez um valor ate atingir o maximo do loop
            media=vet[i]+media;//aqui acumula a nota anterior com a proxima fazendo a soma
        
            
        }
        media=media/4;//aqui pego a mesma variavel que guardou os valores e divido por 4
       
        if(media>=60)//condição se for maior ou igual a 60
        {
            bool="APROVADO";//recebe uma string com aprovado
            
        }
        else
        {
            bool="REPROVADO";//recebe uma string com reprovado
            
        }
        
        


        String resultado ="O aluno esta "+bool+" \na media do aluno e \n"+media;
        return resultado;
    }
}
