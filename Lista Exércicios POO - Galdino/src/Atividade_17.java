import java.util.Scanner;
public class Atividade_17 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que receba a temperatura de dois dias e retorne se vai chover ou n�o
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a temperatura do Dia 1: ");
		int temperaturaD1 = entrada.nextInt();
		
		System.out.print("Insira a temperatura do Dia 2: ");
		int temperaturaD2 = entrada.nextInt();
		
		if(temperaturaD1 < 20 && temperaturaD2 > 20)
			System.out.print("N�o ir� chover");
		else
			System.out.print("Ir� chover");

		
		
		entrada.close();
	}

}
