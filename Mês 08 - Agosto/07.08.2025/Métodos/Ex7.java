import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		String mensagem = "";

		if (numero == 1) {
			mensagem = imprimirVerao();
		} else if (numero == 2) {
			mensagem = imprimirOutono();
		} else if (numero == 3) {
			mensagem = imprimirInverno();
		} else if (numero == 4) {
			mensagem = imprimirPrimavera();
		}

		System.out.println(mensagem);

	}

	public static String imprimirVerao() {
		return "É verão\nE o tempo está quente";
	}

	public static String imprimirOutono() {
		return "É outono\nE as folhas estão caindo";
	}

	public static String imprimirInverno() {
		return "É inverno\nE está frio";
	}

	public static String imprimirPrimavera() {
		return "É primavera\nE as folhas estão florindo";
	}

}
