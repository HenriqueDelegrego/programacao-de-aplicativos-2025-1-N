
public class Ex7 {

	public static void main(String[] args) {

		// Criação de quatro objetos do tipo Aeronave
		// A aeronave a1 é criada co valores inválidos para teste
		Aeronave a1 = new Aeronave("        ", -200, -500, -1000, -5);
		Aeronave a2 = new Aeronave("Cessna", 5, 250, 300, 2);
		Aeronave a3 = new Aeronave("Fokker", 10, 200, 250, 2);
		Aeronave a4 = new Aeronave("Airbus", 300, 450, 1500, 7);

		Aeronave vetor[] = { a1, a2, a3, a4 };

		// Qual aeronave leva o maior número de passageiros?

		int maisPassageiros = Integer.MIN_VALUE;
		String modeloMaisPassageiros = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getQtdPassageiros() > maisPassageiros) {
				maisPassageiros = vetor[i].getQtdPassageiros();
				modeloMaisPassageiros = vetor[i].getModelo();
			}
		}

		System.out.println(modeloMaisPassageiros);

		// Qual das aeronaves pode ficar mais tempo no ar?

		double maiorAutonomia = Double.MIN_VALUE;
		String modeloMaiorAutonomia = "";
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularAutonomia() > maiorAutonomia) {
				maiorAutonomia = vetor[i].calcularAutonomia();
				modeloMaiorAutonomia = vetor[i].getModelo();
			}
		}

		System.out.println(modeloMaiorAutonomia);

		// Considerando que os aviões estão em velocidade máxima, qual deles consegue
		// voar mais longe?

		double maiorDistancia = Double.MIN_VALUE;
		String modeloMaiorDistanica = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularDistanciaMaxima() > maiorDistancia) {
				maiorDistancia = vetor[i].calcularDistanciaMaxima();
				modeloMaiorDistanica = vetor[i].getModelo();
			}
		}

		System.out.println(modeloMaiorDistanica);

	}

}
