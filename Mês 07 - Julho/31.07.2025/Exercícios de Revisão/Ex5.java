import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número de inscrição");

		String numeroInscricao = input.next();

		System.out.println("Insira a altura");

		double altura = input.nextDouble();

		int contador = 0;

		double maiorAltura = Double.MIN_VALUE;
		double menorAltura = Double.MAX_VALUE;
		String inscMaiorAltura = "";
		String inscMenorAltura = "";
		
		double somaAlturas = 0;

		while (!numeroInscricao.equals("0")) {

			somaAlturas += altura;
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
				inscMaiorAltura = numeroInscricao;
			}

			if (altura < menorAltura) {
				menorAltura = altura;
				inscMenorAltura = numeroInscricao;
			}

			contador++;

			System.out.println("Insira o número de inscrição");

			numeroInscricao = input.next();

			System.out.println("Insira a altura");

			altura = input.nextDouble();

		}
		
		double media = somaAlturas / contador;
		
		
		System.out.println("O atleta mais alto é\nNº: " + inscMaiorAltura + " (" + maiorAltura + "m)");
		System.out.println("O atleta mais baixo é\nNº: " + inscMenorAltura + " (" + menorAltura + "m)");
		System.out.println("Média de alturas: " + media);
		System.out.println(contador + " atletas contados");


	}

}
