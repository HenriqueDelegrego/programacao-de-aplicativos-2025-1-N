import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {

	private List<Retangulo> listaRetangulos;

	public FormasGeometricas() {
		listaRetangulos = new ArrayList<Retangulo>();
	}

	// Obter o retangulo com o maior perimetro
	public Retangulo obterRetanguloMaiorPerimetro() {
		double maiorPerimetro = Double.MIN_VALUE;
		Retangulo rMaiorPerimetro = null;

		for (Retangulo r : listaRetangulos) {
			if (r.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.calcularPerimetro();
				rMaiorPerimetro = r;
			}
		}

		return rMaiorPerimetro;

	}

	// Obter o retangulo com o maior area
	public Retangulo obterRetanguloMaiorArea() {
		double maiorArea = Double.MIN_VALUE;
		Retangulo rMaiorArea = null;

		for (Retangulo r : listaRetangulos) {
			if (r.calcularArea() > maiorArea) {
				maiorArea = r.calcularArea();
				rMaiorArea = r;
			}
		}

		return rMaiorArea;

	}

	// Create
	public void adicionarRetangulo(Retangulo r) {
		listaRetangulos.add(r);
	}

	// Read
	public List<Retangulo> obterListaRetangulos() {
		return listaRetangulos;
	}

}
