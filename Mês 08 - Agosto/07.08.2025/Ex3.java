import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		imprimirSequencia(numero);

	}

	public static void imprimirSequencia(int numero) {

		for (int i = numero; i <= numero + 20; i++) {
			System.out.println(i);
		}

	}

}
