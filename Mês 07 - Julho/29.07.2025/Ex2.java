import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

	// Criação do scanner
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira o nome");
		String nome = input.next();

		System.out.println("Insira o total de vendas");
		double receita = input.nextDouble();

		System.out.println("Insira o salário fixo");
		double salarioFixo = input.nextDouble();
		
		
		double salarioFinal = salarioFixo + (receita * 0.15);
		
		System.out.println("O vendedor " + nome + " teve um salario de R$" + df.format(salarioFinal));
		
		

	}

}
