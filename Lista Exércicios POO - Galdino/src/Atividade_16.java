import java.util.Scanner;

public class Atividade_16 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba a média do aluno e retorne se o mesmo foi aprovado ou não
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a média: ");
		double media = entrada.nextDouble();
		
		if (media >= 7) {
			System.out.println("Parabéns, você foi aprovado");
		} else {
			System.out.println("Infelizmente você não foi aprovado");
		}
		
		
		
		entrada.close();

	}

}
