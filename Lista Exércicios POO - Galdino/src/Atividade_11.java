import java.util.Scanner;

public class Atividade_11 {

	public static void main(String[] args) {
		// Escreva um c�digo que receba dois valores e retorne a divis�o
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("insira o segundo valor: ");
		int valor2 = entrada.nextInt();
		double totalDivisao = valor1/valor2;
		
		System.out.printf("O resultado da divis�o de %d com %d �: %.2f", valor1, valor2, totalDivisao);
		
		
		
		entrada.close();

	}

}
