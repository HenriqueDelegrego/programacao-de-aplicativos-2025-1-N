
public class Gato extends Animal {

	private boolean castrado;

	public Gato(String especie, double peso, boolean castrado) {
		super(especie, peso);
		this.castrado = castrado;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Miau";
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

}
