
public class Carro {

	private double velocidade;

	public Carro(double velocidade) {
		setVelocidade(velocidade);
	}

	public void acelerar(double aceleracao) {
		if (aceleracao < 0 || aceleracao >= 20) {
			throw new IllegalArgumentException("Aceleração inválida");
		}
		setVelocidade(velocidade + aceleracao);
	}

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
