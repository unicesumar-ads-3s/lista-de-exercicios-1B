package br.unicesumar.ads;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que executa os exercícios.
 * Não precisa Editar!!!
 * Você irá editar apenas o método run() das classes correspondentes aos exercicios
 *
 */
public class ListaExercicio
{
    public static void main( String[] args )
    {
        List<InterfaceExercicio> ListaExercicios = new ArrayList<InterfaceExercicio>();

        //ListaExercicios.add(new ExercicioExemplo());

        ListaExercicios.add(new Exercicio1a());
        ListaExercicios.add(new Exercicio1b());
        ListaExercicios.add(new Exercicio1c());
        ListaExercicios.add(new Exercicio1d());
        ListaExercicios.add(new Exercicio1e());
        ListaExercicios.add(new Exercicio1f());
        ListaExercicios.add(new Exercicio1g());

        ListaExercicios.add(new Exercicio2a());
        ListaExercicios.add(new Exercicio2b());
        ListaExercicios.add(new Exercicio2c());
        ListaExercicios.add(new Exercicio2d());
        ListaExercicios.add(new Exercicio2e());
        ListaExercicios.add(new Exercicio2f());
        ListaExercicios.add(new Exercicio2g());
        ListaExercicios.add(new Exercicio2h());
        ListaExercicios.add(new Exercicio2i());

        ListaExercicios.add(new Exercicio3a());

        for (InterfaceExercicio exercicio : ListaExercicios) {
            System.out.println("Executando classe: " + exercicio.getClass().getSimpleName());
            System.out.println(exercicio.run());
            System.out.println("\n");
        }
    }
}
