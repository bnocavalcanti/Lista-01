import java.util.Scanner;
public class Atividade_17 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba a temperatura de dois dias e retorne se vai chover ou não
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a temperatura do Dia 1: ");
		int temperaturaD1 = entrada.nextInt();
		
		System.out.print("Insira a temperatura do Dia 2: ");
		int temperaturaD2 = entrada.nextInt();
		
		if(temperaturaD1 < 20 && temperaturaD2 > 20)
			System.out.print("Não irá chover");
		else
			System.out.print("Irá chover");

		
		
		entrada.close();
	}

}
