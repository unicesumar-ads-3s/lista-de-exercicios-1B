package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.
        Scanner teclado= new Scanner(System.in);
        int r;
        float a,V;
        System.out.println("Digite o Raio");
        r = teclado.nextInt();
        System.out.println("Digite a Area");
        a = teclado.nextFloat();

        V = (float) (Math.PI * (r*r) * a);

        System.out.println("Volume: "+ V);
        String resultado = "Código não implementado";
        return resultado;
    }
}
