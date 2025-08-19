
public class Aeronave {

	// Atributos encapsulados
	private String modelo;
	private int qtdPassageiros;
	private double velMax;
	private double capCombustivel;
	private double queimaCombustivel;

	public Aeronave(String modelo, int qtdPassageiros, double velMax, double capCombustivel, double queimaCombustivel) {
		// Validação dos parâmetros recebidos
		setModelo(modelo);
		setQtdPassageiros(qtdPassageiros);
		setVelMax(velMax);
		setCapCombustivel(capCombustivel);
		setQueimaCombustivel(queimaCombustivel);
	}

	/**
	 * Calcula a autonomia da aeronave.
	 * 
	 * A autonomia é calculada pela fórmula: autonomia = capacidade de combustível /
	 * queima de combustível
	 * 
	 * @return A autonomia da aeronave.
	 */
	public double calcularAutonomia() {
		return capCombustivel / queimaCombustivel;
	}

	/**
	 * Calcula a distância máxima que a aeronave pode voar. A distância máxima é
	 * calculada pela fórmula: distância máxima = autonomia * velocidade máxima
	 * 
	 * @return A distância máxima que a aeronave pode voar em quilômetros.
	 */
	public double calcularDistanciaMaxima() {
		return calcularAutonomia() * velMax;
	}

	/**
	 * Retorna o modelo da aeronave.
	 * 
	 * @return O modelo da aeronave.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Define o modelo da aeronave.
	 * 
	 * @param modelo - O modelo da aeronave.
	 * 
	 */
	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			System.out.println("Erro, modelo inválido");
		} else {
			this.modelo = modelo;
		}
	}

	/**
	 * Retorna a quantidade de passageiros da aeronave.
	 * 
	 * @return A quantidade de passageiros da aeronave.
	 */
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	/**
	 * Define a quantidade de passageiros da aeronave.
	 * 
	 * @param qtdPassageiros - A quantidade de passageiros da aeronave.
	 */
	public void setQtdPassageiros(int qtdPassageiros) {
		if (qtdPassageiros < 0) {
			System.out.println("Erro, quantidade de passageiros inválida");
		} else {
			this.qtdPassageiros = qtdPassageiros;
		}
	}

	/**
	 * Retorna a velocidade máxima da aeronave.
	 * 
	 * @return A velocidade máxima da aeronave.
	 */
	public double getVelMax() {
		return velMax;
	}

	/**
	 * Define a velocidade máxima da aeronave.
	 * 
	 * @param velMax - A velocidade máxima da aeronave.
	 */
	public void setVelMax(double velMax) {
		if (velMax <= 0) {
			System.out.println("Erro, velocidade máxima incorreta");
		} else {
			this.velMax = velMax;
		}
	}

	/**
	 * Retorna a capacidade de combustível da aeronave.
	 * 
	 * @return A capacidade de combustível da aeronave.
	 */
	public double getCapCombustivel() {
		return capCombustivel;
	}

	/**
	 * Define a capacidade de combustível da aeronave.
	 * 
	 * @param capCombustivel - A capacidade de combustível da aeronave.
	 */
	public void setCapCombustivel(double capCombustivel) {
		if (capCombustivel <= 0) {
			System.out.println("Erro, capacidade de combustível inválida");
		}
		this.capCombustivel = capCombustivel;
	}

	/**
	 * Retorna a queima de combustível da aeronave.
	 * 
	 * @return A queima de combustível da aeronave.
	 */
	public double getQueimaCombustivel() {
		return queimaCombustivel;
	}

	/**
	 * Define a queima de combustível da aeronave.
	 * 
	 * @param queimaCombustivel - A queima de combustível da aeronave.
	 */
	public void setQueimaCombustivel(double queimaCombustivel) {
		if (queimaCombustivel <= 0) {
			System.out.println("Erro, queima de combustível inválida");
		}
		this.queimaCombustivel = queimaCombustivel;
	}

	// Método toString para facilitar a visualização dos dados da aeronave
	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + qtdPassageiros + ", velMax=" + velMax
				+ ", capCombustivel=" + capCombustivel + ", queimaCombustivel=" + queimaCombustivel + "]";
	}

}
