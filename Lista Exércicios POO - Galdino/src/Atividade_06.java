import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {

		// Crie um algoritmo que receba e apresente os seguintes dados: Nome, endere�o,
		// produto;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o produto: ");
		String produto = entrada.nextLine();
		System.out.print("Digite o endere�o: ");
		String endereco = entrada.nextLine();

		System.out.printf("O cliente %s solicitou o produto %s para ser entregue no seguinte endere�o: %s", nome,
				produto, endereco);

		entrada.close();

	}

}
