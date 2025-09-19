
public class Flor {

	// Atributos
	private String nomeFlor;
	private double preco;
	private String nomeCliente;
	private boolean presente;

	// Construtor
	public Flor(String nomeFlor, double preco, String nomeCliente, boolean presente) {
		setNomeFlor(nomeFlor);
		setPreco(preco);
		setNomeCliente(nomeCliente);
		setPresente(presente);
	}

	// Getters e Setters
	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		if (nomeFlor == null || nomeFlor.isBlank()) {
			throw new IllegalArgumentException("Nome da flor inválido");
		}
		this.nomeFlor = nomeFlor;
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

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente == null || nomeCliente.isBlank()) {
			throw new IllegalArgumentException("Nome do cliente inválido");
		}
		this.nomeCliente = nomeCliente;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	@Override
	public String toString() {
		return "Flor [nomeFlor=" + nomeFlor + ", preco=" + preco + ", nomeCliente=" + nomeCliente + ", presente="
				+ presente + "]";
	}

}
