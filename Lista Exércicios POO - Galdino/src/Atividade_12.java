import java.util.Scanner;

public class Atividade_12 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba dois valores e retorne o resto da divisão
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = entrada.nextInt();
		int restoDivisao = valor1%valor2;
		double totalDivisao = valor1/valor2;
		
		System.out.printf("A divisão entre %d e %d é %.0f e tem como resto %d.", valor1, valor2, totalDivisao, restoDivisao);
		

		entrada.close();

	}

}
