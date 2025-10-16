
public class Gato implements Animal{

	private String especie;
	private double peso;

	private boolean castrado;

	public Gato(String especie, double peso, boolean castrado) {
		super();
		this.especie = especie;
		this.peso = peso;
		this.castrado = castrado;
	}
	
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Miau";
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

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	

}