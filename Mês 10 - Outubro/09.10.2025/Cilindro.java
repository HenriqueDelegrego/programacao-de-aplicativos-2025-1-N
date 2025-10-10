
public class Cilindro extends Circulo {

	private double altura;

	public Cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		setAltura(altura);
	}

	public double calcularVolume() {
		return calcularArea() * altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("Altura inválida");
		}
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + "]";
	}

}
