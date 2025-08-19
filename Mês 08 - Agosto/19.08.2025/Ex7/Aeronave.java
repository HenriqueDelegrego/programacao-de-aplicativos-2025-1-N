
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

	public double calcularAutonomia() {
		return capCombustivel / queimaCombustivel;
	}

	public double calcularDistanciaMaxima() {
		return calcularAutonomia() * velMax;
	}

}
