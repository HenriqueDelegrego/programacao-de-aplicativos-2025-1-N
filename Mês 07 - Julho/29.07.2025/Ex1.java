import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.println("Insira seu número de matrícula");
		String matricula = input.next();

		System.out.println("Insira seu nome");
		String nome = input.next();

		System.out.println("Insira suas horas trabalhadas");
		double qtdHoras = input.nextDouble();

		System.out.println("Insira seu salário por hora");
		double salarioHora = input.nextDouble();

		double salario = (qtdHoras * 4) * salarioHora;

		System.out.println("Matrícula: " + matricula);

		System.out.println("Nome: " + nome);

		System.out.println("Salário: " + df.format(salario));

	}

}
