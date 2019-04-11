package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1g implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

        Scanner entrada = new Scanner(System.in);
        double RaioGalao, AreaGalao, VolumeGalao;

        System.out.print("Cálculo de volume de um galão\n\n");


        System.out.print("Digite Raio do galão (em cm): ");
        RaioGalao = entrada.nextDouble()/2;

        System.out.print("Digite a altura do galão (em cm): ");
        AreaGalao = entrada.nextDouble();


        VolumeGalao = Math.PI * RaioGalao * RaioGalao * AreaGalao;

        System.out.print("\n O volume do galão é de " + VolumeGalao + " cm³\n");
        return "\n O volume do galão é de " + VolumeGalao + " cm³\n";
       
    }
}