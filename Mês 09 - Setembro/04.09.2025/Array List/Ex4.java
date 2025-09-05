import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(5);
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(7);
		listaNumeros.add(24);
		listaNumeros.add(15);

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor");

		int numero = input.nextInt();

		int indice = listaNumeros.indexOf(numero);

		if (indice != -1) {
			System.out.println("O elemento está no índice " + indice);
		} else {
			System.out.println("Não existe");
		}

	}

}
