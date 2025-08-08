import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		boolean resultado = numeroParImparMelhorado(numero);

		System.out.println(resultado);

	}

	public static boolean numeroParImpar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean numeroParImparMelhorado(int numero) {
		return numero % 2 == 0;
	}

}
