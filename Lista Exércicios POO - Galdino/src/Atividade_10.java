import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba dois valores e retorne uma multipica��o
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("insira o segundo valor: ");
		int valor2 = entrada.nextInt();
		
		int totalMultiplicacao = valor1-valor2;
		
		System.out.printf("O resultado da multiplica��o de %d com %d �: %d", valor1, valor2, totalMultiplicacao);
		
		
		
		entrada.close();
	}

}
