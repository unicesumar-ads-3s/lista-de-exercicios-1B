package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementaÃ§Ã£o do exercicio
        // O mÃ©todo deve retornar uma string
        // Caso o resultado seja um valor numÃ©rico, o valor deve
        // ser convertido em String.
        
        package exercicio;

import java.util.Scanner;

/**
 *
 * @author UniCesumar
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double VelocidadeMedia, TempoGasto, Autonomia = 12; //Velocidade média em Km/h, Tempo gasto em horas e autonomia em Km/L
		double Distancia, LitrosUsados;		

		System.out.print("Cálculo da quantidade de litros de combustível gasta em uma viagem\n\n");
		
		
		System.out.print("Digite o tempo que você gastou em sua viagem (horas): ");
		TempoGasto = entrada.nextDouble();
		
		System.out.print("Digite o Velocidade Média em que você fez o percurso (Km/h): ");
		VelocidadeMedia = entrada.nextDouble();

		
		Distancia = VelocidadeMedia * TempoGasto;
		LitrosUsados = Distancia / Autonomia;


		System.out.print("\n\n\nResultados:\n\n");
		System.out.print("Velocidade média = " + VelocidadeMedia + " Km/h\n");
		System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
		System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
		System.out.print("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");

	}

}   
    
    
}




        String resultado = "CÃ³digo nÃ£o implementado";
        return resultado;
    }
}
