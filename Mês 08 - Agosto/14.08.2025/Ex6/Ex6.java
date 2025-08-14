
public class Ex6 {

	public static void main(String[] args) {

		Mercado unidadeDeBlumenau = new Mercado();
		unidadeDeBlumenau.nomeMercado = "Blumenau";
		unidadeDeBlumenau.qtdMacasVendidas = 200;
		unidadeDeBlumenau.precoMaca = 1.8;
		unidadeDeBlumenau.qtdLaranjasVendidas = 15000;
		unidadeDeBlumenau.precoLaranja = 2;

		Mercado unidadeDeJoinville = new Mercado();
		unidadeDeJoinville.nomeMercado = "Joinville";
		unidadeDeJoinville.qtdMacasVendidas = 250;
		unidadeDeJoinville.precoMaca = 2.2;
		unidadeDeJoinville.qtdLaranjasVendidas = 240;
		unidadeDeJoinville.precoLaranja = 2.45;

		Mercado unidadeDeFlorianopolis = new Mercado();
		unidadeDeFlorianopolis.nomeMercado = "Florianópolis";
		unidadeDeFlorianopolis.qtdMacasVendidas = 227;
		unidadeDeFlorianopolis.precoMaca = 2.14;
		unidadeDeFlorianopolis.qtdLaranjasVendidas = 214;
		unidadeDeFlorianopolis.precoLaranja = 2.32;

		// Criando um vetor de Mercado para armazenar as unidades
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
