import java.util.Scanner;

public class Atividade_14 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba 3 sal�rios e retorne a m�dia de salarial da empresa
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio: ");
		double salario1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo sal�rio: ");
		double salario2 = entrada.nextDouble();
		
		
		System.out.print("Informe o terceiro sal�rio: ");
		double salario3 = entrada.nextDouble();
		
		double mediaSalario = (salario1+salario2+salario3)/3;
		
		System.out.printf("\nA m�dia salarial da empresa �: %.2f.",mediaSalario );
		
		
		entrada.close();

	}

}
