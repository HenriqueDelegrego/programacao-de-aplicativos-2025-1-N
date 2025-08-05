import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do seu colega");

		String nome = input.next();

		if (nome.equalsIgnoreCase("joão")) {
			joao();
		} else if (nome.equalsIgnoreCase("maria")) {
			maria();
		}

	}

	// Criação do método joao
	public static void joao() {
		System.out.println("O nome dele é João");
		System.out.println("Ele tem 19 anos");
		System.out.println("Ele é estudante do SENAI");
	}

	public static void maria() {
		System.out.println("O nome dela é Maria");
		System.out.println("Ela tem 22 anos");
		System.out.println("Ela é estudante do SENAI");
	}

}
