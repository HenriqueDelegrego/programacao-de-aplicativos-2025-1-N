
public class Aeronave {

	String modelo;
	int qtdPassageiros;
	double velMax;
	double capCombustivel;
	double queimaCombustivel;

	public Aeronave(String modelo, int qtdPassageiros, double velMax, double capCombustivel, double queimaCombustivel) {
		this.modelo = modelo;
		this.qtdPassageiros = qtdPassageiros;
		this.velMax = velMax;
		this.capCombustivel = capCombustivel;
		this.queimaCombustivel = queimaCombustivel;
	}

	/**
	 * Calcula a autonomia da aeronave.
	 * 
	 * A autonomia é calculada pela fórmula:
	 * autonomia = capacidade de combustível / queima de combustível por hora
	 * 
	 * @return A autonomia da aeronave em horas.
	 */
	public double calcularAutonomia() {
		return capCombustivel / queimaCombustivel;
	}

	/**
	 * Calcula a distância máxima que a aeronave pode voar.
	 * A distância máxima é calculada pela fórmula:
	 * distância máxima = autonomia * velocidade máxima
	 * 
	 * @return A distância máxima que a aeronave pode voar em quilômetros.
	 */
	public double calcularDistanciaMaxima() {
		return calcularAutonomia() * velMax;
	}

}
