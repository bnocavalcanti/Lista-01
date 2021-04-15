import java.util.Scanner;

public class Atividade_11 {

	public static void main(String[] args) {
		// Escreva um código que receba dois valores e retorne a divisão
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("insira o segundo valor: ");
		int valor2 = entrada.nextInt();
		double totalDivisao = valor1/valor2;
		
		System.out.printf("O resultado da divisão de %d com %d é: %.2f", valor1, valor2, totalDivisao);
		
		
		
		entrada.close();

	}

}
