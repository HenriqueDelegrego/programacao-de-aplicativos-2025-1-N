
/**
 * Classe abstrata que representa um animal.
 * Contém atributos comuns a todos os animais e um método abstrato para emitir som.
 * Não pode ser instanciada diretamente.
 */
public abstract class Animal {

	private String especie;
	private double peso;

	public Animal(String especie, double peso) {
		super();
		this.especie = especie;
		this.peso = peso;
	}

	/**
	 * Método abstrato que deve ser implementado por todas as subclasses.
	 * @return String representando o som emitido pelo animal.
	 */
	public abstract String emitirSom();

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

}
