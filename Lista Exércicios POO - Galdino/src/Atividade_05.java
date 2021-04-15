import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		// Crie um algoritmo que receba e apresente os seguintes dados: Nome, cpf, sexo,idade
		 

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o cpf: ");
		String cpf = entrada.nextLine();
		System.out.print("Digite o sexo: ");
		String sexo = entrada.nextLine();
		System.out.print("Digite a idade: ");
		int idade = entrada.nextInt();

		System.out.printf("O aluno, %s com CPF %s do sexo %s tem %d anos", nome, cpf, sexo, idade);

		entrada.close();

	}

}
