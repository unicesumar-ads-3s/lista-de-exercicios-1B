package br.unicesumar.ads;

import java.util.Scanner;

public class Exercicio1a implements InterfaceExercicio {
    @Override
    public String run() {
        // Aqui vai a implementação do exercicio
        // O método deve retornar uma string
        // Caso o resultado seja um valor numérico, o valor deve
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
		double VelocidadeMedia, TempoGasto, Autonomia = 12; //Velocidade m�dia em Km/h, Tempo gasto em horas e autonomia em Km/L
		double Distancia, LitrosUsados;		

		System.out.print("C�lculo da quantidade de litros de combust�vel gasta em uma viagem\n\n");
		
		
		System.out.print("Digite o tempo que voc� gastou em sua viagem (horas): ");
		TempoGasto = entrada.nextDouble();
		
		System.out.print("Digite o Velocidade M�dia em que voc� fez o percurso (Km/h): ");
		VelocidadeMedia = entrada.nextDouble();

		
		Distancia = VelocidadeMedia * TempoGasto;
		LitrosUsados = Distancia / Autonomia;


		System.out.print("\n\n\nResultados:\n\n");
		System.out.print("Velocidade m�dia = " + VelocidadeMedia + " Km/h\n");
		System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
		System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
		System.out.print("Quantidade de Combust�vel utilizado: " + LitrosUsados + " litros\n");

	}

}   
    
    
}




        String resultado = "Código não implementado";
        return resultado;
    }
}
