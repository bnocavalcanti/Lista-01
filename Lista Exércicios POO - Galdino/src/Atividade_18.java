import java.util.Scanner;
public class Atividade_18 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que receba uma idade e retorne se a pessoa est� no grupo de risco (acima de 40 anos)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a idade: ");
		int idade  = entrada.nextInt();
		
		if(idade >= 40)
			System.out.print("Est� no grupo de risco!");
		else
			System.out.print("N�o est� no grupo de risco!");
		

		entrada.close();
	}

}
