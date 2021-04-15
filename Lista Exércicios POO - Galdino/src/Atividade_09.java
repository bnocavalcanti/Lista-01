import java.util.Scanner;

public class Atividade_09 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba dois valores e retorne a subtração

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();

		System.out.print("Insira o segundo valor: ");
		int valor2 = entrada.nextInt();

		int totalSubtracao = valor1 - valor2;

		System.out.printf("O resultado da subtração de %d com %d é: %d ", valor1, valor2, totalSubtracao);

		entrada.close();

	}

}
