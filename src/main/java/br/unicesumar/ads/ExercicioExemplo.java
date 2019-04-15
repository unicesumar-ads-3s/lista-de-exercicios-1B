package br.unicesumar.ads;

import java.util.Scanner;

/**
 * Classe de exemplo para a lista de exercicio
 * Todos os exercicios devem seguir este modelo
 */
public class ExercicioExemplo implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
        // ser convertido em String.

        // O exemplo abaixo calcula a soma de dois valores lidos do teclado
        // e retorna uma string com o resultado
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com o valor de um número inteiro: ");
        int num1 = in.nextInt();
        System.out.print("Entre com o valor de outro número inteiro: ");
        int num2 = in.nextInt();

        int soma = num1 + num2;

        String resultado = "A soma de " + num1 + " e " + num2 + " é igual a " + soma;
        return resultado;
    }
}
