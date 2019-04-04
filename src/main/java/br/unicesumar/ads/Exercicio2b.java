package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2b implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
Scanner teclado = new Scanner (System.in);
   int num;

   System.out.println("Digite um numero qualquer");
   num = teclado.nextInt();

if(num<0){
   num = -(num);
}

String strnum=String.format("%d",num);
System.out.println("O seu numero positivo é:"+strnum);





        String resultado = "O seu numero positivo é:"+strnum;
        return resultado;
    }
}
