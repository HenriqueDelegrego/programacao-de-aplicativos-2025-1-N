
public class Ex4 {

	public static void main(String[] args) {

		int vetor[] = { 1, 5, 6, -8, 84 };
		
		encontrarMaiorValor(vetor);
		encontrarMenorValor(vetor);
		calcularMedia(vetor);

	}

	public static void encontrarMaiorValor(int vetor[]) {
		int maiorValor = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		System.out.println(maiorValor);

	}

	public static void encontrarMenorValor(int vetor[]) {
		int menorValor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}

		System.out.println(menorValor);
	}

	public static void calcularMedia(int vetor[]) {
		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;

		System.out.println(media);

	}

}
