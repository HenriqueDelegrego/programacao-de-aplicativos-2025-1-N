
public class Conta {

	private String nomeTitular;
	private double saldo;

	public Conta(String nomeTitular, double saldo) {
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	}

	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser positivo");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Valor não pode ser maior do que saldo");
		}

		saldo -= valor;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser positivo");
		}

		saldo += valor;
	}

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
