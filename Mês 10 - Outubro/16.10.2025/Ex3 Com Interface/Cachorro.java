// As classes Cachorro e Gato implementam a interface Animal, garantindo que ambas forneçam uma implementação para o método emitirSom().
public class Cachorro implements Animal {

	private String especie;
	private double peso;
	private String raca;

	public Cachorro(String especie, double peso, String raca) {
		super();
		this.especie = especie;
		this.peso = peso;
		this.raca = raca;
	}

	/**
	 * Método que implementa o som característico do cachorro.
	 * @return String representando o som "Au au".
	 */
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Au au";
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
