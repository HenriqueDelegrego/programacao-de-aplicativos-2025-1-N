
public class Carro {

	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private double preco;

	public Carro(String marca, String modelo, String placa, int ano, double preco) {
		setMarca(marca);
		setModelo(modelo);
		setPlaca(placa);
		setAno(ano);
		setPreco(preco);
	}

	public double calcularDepreciacao(int anoAlvo) {

		if (anoAlvo <= 2025) {
			throw new IllegalArgumentException("Ano inválido");
		}

		int anosDepreciados = anoAlvo - 2025;

		double taxa = calcularTaxa();

		return preco * Math.pow(1 - taxa, anosDepreciados);
	}

	private double calcularTaxa() {
		if (ano < 2015) {
			return 0.07;
		}
		return 0.05;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca inválida");
		}
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido");
		}
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa == null || placa.isBlank()) {
			throw new IllegalArgumentException("Placa inválida");
		}
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 1886 || ano > 2026) {
			throw new IllegalArgumentException("Ano inválido");
		}
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", preco=" + preco
				+ "]";
	}

}
