import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");

		int numero = input.nextInt();

		if (numero == 1) {
			imprimirVerao();
		} else if (numero == 2) {
			imprimirOutono();
		} else if (numero == 3) {
			imprimirInverno();
		} else if (numero == 4) {
			imprimirPrimavera();
		}

	}

	public static void imprimirVerao() {
		System.out.println("É verão\nE o tempo está quente");
	}

	public static void imprimirOutono() {
		System.out.println("É outono\nE as folhas estão caindo");

	}

	public static void imprimirInverno() {
		System.out.println("É inverno\nE está frio");

	}

	public static void imprimirPrimavera() {
		System.out.println("É primavera\nE as folhas estão lindas");

	}

}
