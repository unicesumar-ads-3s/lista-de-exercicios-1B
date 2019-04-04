package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio2c implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        float N1,N2,N3,N4,media;
               //N1 = NOTA 1, etc
               Scanner teclado = new Scanner (System.in);
               System.out.println("este programa ira calcular a sua média de notas de acordo com as notas que voce informar");
               do{
                   System.out.println("informe a primeira nota");
                   N1 = teclado.nextFloat();
               }while((N1<0)||(N1>10.0));
               do{
                   System.out.println("informe a segunda nota");
                   N2 = teclado.nextFloat();
               }while((N2<0)||(N2>10.0));
               do{
                   System.out.println("informe a terceira nota");
                   N3 = teclado.nextFloat();
               }while((N3<0)||(N3>10.0));
               do{
                   System.out.println("informe a quarta nota");
                   N4 = teclado.nextFloat();
               }while((N4<0)||(N4>10.0));
               //usuario informa as 4 notas, que não podem ser negativas e nem maiores que 10

               media = (N1 + N2 + N3 + N4)/4;
               //calculo da média

               String strmedia=String.format("%.1f",media);
               //deixando a media com 1 numero depois da virgula

               if(media<6){
                   System.out.println("aluno reprovado!!! :(\nsua media foi: "+strmedia);
               }else{
                   System.out.println("aluno aprovado!!! :)\nsua media foi: "+strmedia);
               }
    }
}
