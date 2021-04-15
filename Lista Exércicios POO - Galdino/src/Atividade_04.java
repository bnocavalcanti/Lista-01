
public class Atividade_04 {

	public static void main(String[] args) {
		// Crie um algoritmo que apresente os seguintes dados:Nome, sexo, idade, estado civil, salario;
		
		String nome = "Bruno";
		String sexo = "masculino";
		String estadoCivil = "solteiro";
		int idade = 26;
		double salario = 3500.35;
		String texto = "O funcionário %s, do sexo %s com idade %d e de estado civil %s possui um salário de %.2f.";
		
		System.out.printf(texto, nome, sexo, idade, estadoCivil, salario);
		 

	}

}
