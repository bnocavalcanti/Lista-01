import java.util.Scanner;
public class Atividade_18 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba uma idade e retorne se a pessoa está no grupo de risco (acima de 40 anos)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a idade: ");
		int idade  = entrada.nextInt();
		
		if(idade >= 40)
			System.out.print("Está no grupo de risco!");
		else
			System.out.print("Não está no grupo de risco!");
		

		entrada.close();
	}

}
