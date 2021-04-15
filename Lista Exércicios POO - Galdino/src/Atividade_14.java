import java.util.Scanner;

public class Atividade_14 {

	public static void main(String[] args) {
		// Escreva um algoritmo que receba 3 salários e retorne a média de salarial da empresa
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		double salario1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo salário: ");
		double salario2 = entrada.nextDouble();
		
		
		System.out.print("Informe o terceiro salário: ");
		double salario3 = entrada.nextDouble();
		
		double mediaSalario = (salario1+salario2+salario3)/3;
		
		System.out.printf("\nA média salarial da empresa é: %.2f.",mediaSalario );
		
		
		entrada.close();

	}

}
