import java.util.Scanner;

public class Atividade_13 {

	public static void main(String[] args) {
		// Escreva um algoritmo que recebe o nome do aluno, duas notas e retorna a média
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o nome do aluno: ");
		String aluno = entrada.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		System.out.printf("O aluno %s obteve %.2f na primeira avaliação e %.2f na segunda avaliação, obtendo a média %.2f.", aluno, nota1, nota2, media);
		

		
		
		entrada.close();
	}

}
