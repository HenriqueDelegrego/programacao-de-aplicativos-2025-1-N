
public class Mercado {

	String nomeMercado;
	int qtdMacasVendidas;
	double precoMaca;
	int qtdLaranjasVendidas;
	double precoLaranja;

	
	// Construtor de Mercado
	public Mercado(String nomeMercado, int qtdMacasVendidas, double precoMaca, int qtdLaranjasVendidas,
			double precoLaranja) {
		this.nomeMercado = nomeMercado;
		this.qtdMacasVendidas = qtdMacasVendidas;
		this.precoMaca = precoMaca;
		this.qtdLaranjasVendidas = qtdLaranjasVendidas;
		this.precoLaranja = precoLaranja;
	}

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
