
public class Contribuinte {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}

	/**
	 * Calcula a alíquota do imposto de renda com base na renda anual
	 * @return A alíquota correspondente
	 */
	private double calcularAliquota() {
		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return 0.058;
		} else if (rendaAnual <= 25000) {
			return 0.15;
		} else if (rendaAnual <= 35000) {
			return 0.275;
		} else {
			return 0.3;
		}
	}

	/**
	 * Calcula o imposto de renda a ser pago com base na renda anual e na alíquota
	 * @return O valor do imposto de renda a ser pago
	 */
	public double calcularImposto() {
		return rendaAnual * calcularAliquota();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			System.out.println("Erro, nome inválido");
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			System.out.println("Erro, cpf inválido");
		} else {
			this.cpf = cpf;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.length() != 2) {
			System.out.println("Erro, uf inválida");
		} else {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			System.out.println("Erro, renda anual inválida");
		} else {
			this.rendaAnual = rendaAnual;
		}
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendaAnual + "]";
	}

}
