package Questao_19;
import java.util.Scanner;

public class Questao_19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o comprimento da altura do retângulo: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite a largura da base do retângulo: ");
		double largura = entrada.nextDouble();
		
		Forma retangulo = new Forma();
		
		retangulo.altura = altura;
		retangulo.base = largura;
		
		System.out.printf("Um retangulo com base %.2f e altura %.2f tem área de %.2f e perímetro de %.2f",
		retangulo.base, retangulo.altura, retangulo.Area(), retangulo.Perimetro());
		
		entrada.close();
	}

}
