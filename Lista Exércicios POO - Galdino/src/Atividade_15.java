import java.util.Scanner;

public class Atividade_15 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que recebe o salario e aplica a regra de educa��o financeira 50%-30%-20%;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu sal�rio: ");
		double salario = entrada.nextDouble();

		double valor1 = (50 * salario) / 100;
		double valor2 = (30 * salario) / 100;
		double valor3 = (20 * salario) / 100;

		System.out.printf(
				"\nO Seu sal�rio � %.2f.\nVoc� deve usar %.2f para suas necessidades. \nDeve usar %.2f para seus desejos pessoais."
						+ " \nE %.2f para investimento ou pagar d�vidas", salario, valor1, valor2, valor3);

		entrada.close();

	}

}
