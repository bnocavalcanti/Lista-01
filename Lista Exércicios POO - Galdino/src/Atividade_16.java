import java.util.Scanner;

public class Atividade_16 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba a m�dia do aluno e retorne se o mesmo foi aprovado ou n�o
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a m�dia: ");
		double media = entrada.nextDouble();
		
		if (media >= 7) {
			System.out.println("Parab�ns, voc� foi aprovado");
		} else {
			System.out.println("Infelizmente voc� n�o foi aprovado");
		}
		
		
		
		entrada.close();

	}

}
