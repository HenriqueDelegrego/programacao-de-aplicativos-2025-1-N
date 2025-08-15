
public class Ex6 {

	public static void main(String[] args) {
		// Criando os objetos Mercado, utilizando o construtor
		Mercado unidadeDeBlumenau = new Mercado("Blumenau", 200, 1.8, 15000, 2);

		Mercado unidadeDeJoinville = new Mercado("Joinville", 250, 2.2, 240, 2.45);

		Mercado unidadeDeFlorianopolis = new Mercado("Florianópolis", 227, 2.14, 214, 2.32);

		Mercado vetor[] = { unidadeDeBlumenau, unidadeDeFlorianopolis, unidadeDeJoinville };

		// Quem teve a maior receita vendendo maçãs?
		double maiorReceitaMacas = Double.MIN_VALUE;
		String unidadeMacas = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].obterReceitaMaca() > maiorReceitaMacas) {
				maiorReceitaMacas = vetor[i].obterReceitaMaca();
				unidadeMacas = vetor[i].nomeMercado;
			}
		}
		System.out.println(unidadeMacas);

		// Quem teve a maior receita vendendo laranjas?
		double maiorReceitaLaranjas = Double.MAX_VALUE;
		String unidadeLaranjas = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].obterReceitaLaranja() < maiorReceitaLaranjas) {
				maiorReceitaLaranjas = vetor[i].obterReceitaLaranja();
				unidadeLaranjas = vetor[i].nomeMercado;
			}
		}
		System.out.println(unidadeLaranjas);

		// Qual das lojas teve a segunda maior receita total?
		double maiorReceitaTotal = Double.MIN_VALUE;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].obterReceitaTotal() > maiorReceitaTotal) {
				maiorReceitaTotal = vetor[i].obterReceitaTotal();
			}
		}

		double segundaMaiorReceitaTotal = Double.MIN_VALUE;
		String nomeSegundoTotal = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].obterReceitaTotal() > segundaMaiorReceitaTotal
					&& vetor[i].obterReceitaTotal() != maiorReceitaTotal) {
				segundaMaiorReceitaTotal = vetor[i].obterReceitaTotal();
				nomeSegundoTotal = vetor[i].nomeMercado;
			}

		}

		System.out.println(nomeSegundoTotal);

		// Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou
		// laranjas?

		double receitaLaranjas = 0;
		double receitaMacas = 0;

		for (int i = 0; i < vetor.length; i++) {
			receitaLaranjas += vetor[i].obterReceitaLaranja();
			receitaMacas += vetor[i].obterReceitaMaca();
		}

		if (receitaLaranjas > receitaMacas) {
			System.out.println("Teve uma receita maior com laranjas");
		} else if (receitaMacas > receitaLaranjas) {
			System.out.println("Teve uma receita maior com maçãs");
		} else {
			System.out.println("Receitas iguais");
		}
	}

}
