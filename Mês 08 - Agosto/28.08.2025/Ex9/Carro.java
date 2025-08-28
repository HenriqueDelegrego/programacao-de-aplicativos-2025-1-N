
public class Carro {

	private double velocidade;

	public Carro(double velocidade) {
		setVelocidade(velocidade);
	}

	/**
	 * Acelera o carro
	 * @param aceleracao - Valor da aceleração (0 a 19)
	 * @throws IllegalArgumentException se a aceleração for inválida
	 */
	public void acelerar(double aceleracao) {
		if (aceleracao < 0 || aceleracao >= 20) {
			throw new IllegalArgumentException("Aceleração inválida");
		}
		setVelocidade(velocidade + aceleracao);
	}

	/**
	 * Reduz a velocidade do carro
	 * @param reducao - Valor da redução (0 a 29)
	 * @throws IllegalArgumentException se a redução for inválida
	 */
	public void reduzir(double reducao) {
		if (reducao < 0 || reducao >= 30) {
			throw new IllegalArgumentException("Redução inválida");
		}

		setVelocidade(velocidade - reducao);
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		if (velocidade < 0) {
			throw new IllegalArgumentException("Velocidade inválida");
		}
		this.velocidade = velocidade;
	}

}
