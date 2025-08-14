
public class Mercado {

	String nomeMercado;
	int qtdMacasVendidas;
	double precoMaca;
	int qtdLaranjasVendidas;
	double precoLaranja;

	public double obterReceitaMaca() {
		return qtdMacasVendidas * precoMaca;
	}

	public double obterReceitaLaranja() {
		return qtdLaranjasVendidas * precoLaranja;
	}

	public double obterReceitaTotal() {
		return obterReceitaLaranja() + obterReceitaMaca();
	}

}
