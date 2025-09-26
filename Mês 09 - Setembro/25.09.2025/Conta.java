
public class Conta {

	// Atributos
	private String nomeTitular;
	private double saldo;

	// Construtor
	public Conta(String nomeTitular, double saldo) {
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	}

	/**
	 * Sacar um valor da conta
	 * @param valor - valor a ser sacado
	 */
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser positivo");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Valor não pode ser maior do que saldo");
		}

		saldo -= valor;
	}

	/**
	 * Depositar um valor na conta
	 * @param valor - valor a ser depositado
	 */
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser positivo");
		}

		saldo += valor;
	}

	/**
	 * Transferir um valor para outra conta
	 * @param destinatario - conta que irá receber o valor
	 * @param valor - valor a ser transferido
	 */
	public void transferir(Conta destinatario, double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser positivo");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Valor não pode ser maior do que saldo");
		}

		saldo -= valor;
		destinatario.saldo += valor;

	}

	/**
	 * Simular um investimento com juros compostos de 1% ao mês
	 * @param capitalInicial - valor inicial investido
	 * @param tempo - tempo em meses
	 * @return valor final do investimento
	 */
	public double simularInvestimento(double capitalInicial, int tempo) {
		return capitalInicial * Math.pow(1 + 0.01, tempo);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		if (nomeTitular == null || nomeTitular.isBlank()) {
			throw new IllegalArgumentException("Nome do titular inválido");
		}
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}

}
