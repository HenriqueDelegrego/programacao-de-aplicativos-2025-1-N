import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Double> listaNumeros = new ArrayList<Double>();
		System.out.println("Insira o número");
		double numero = input.nextDouble();
		while (numero != 0) {
			listaNumeros.add(numero);
			System.out.println("Insira o número");
			numero = input.nextDouble();
		}
		System.out.println(Collections.max(listaNumeros));

		System.out.println(Collections.min(listaNumeros));

		double soma = 0;

		for (int i = 0; i < listaNumeros.size(); i++) {
			soma += listaNumeros.get(i);
		}

		double media = soma / listaNumeros.size();

		System.out.println(media);

	}

}
