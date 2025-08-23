
public class Ex8 {

	public static void main(String[] args) {

		Contribuinte c1 = new Contribuinte("João", "11111111111", "SC", 2000);
		Contribuinte c2 = new Contribuinte("Maria", "11111111111", "SC", 5000);
		Contribuinte c3 = new Contribuinte("Pedro", "11111111111", "SC", 10000);
		Contribuinte c4 = new Contribuinte("Carlos", "11111111111", "SC", 28000);
		Contribuinte c5 = new Contribuinte("Joana", "11111111111", "SC", 40000);

		Contribuinte vetor[] = { c1, c2, c3, c4, c5 };

		// Quem mais paga imposto

		double maiorImposto = 0;
		String nomeMaiorImposto = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularImposto() > maiorImposto) {
				maiorImposto = vetor[i].calcularImposto();
				nomeMaiorImposto = vetor[i].getNome();
			}
		}

		System.out.println(nomeMaiorImposto);

		// Qual o total de imposto pago entre os 5 contribuintes?

		double somaImposto = 0;
		for (int i = 0; i < vetor.length; i++) {
			somaImposto += vetor[i].calcularImposto();
		}

		System.out.println(somaImposto);
	}

}
