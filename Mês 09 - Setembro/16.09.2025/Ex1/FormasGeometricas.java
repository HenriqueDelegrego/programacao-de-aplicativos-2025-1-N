import java.util.ArrayList;
import java.util.List;

// Classe que representa um conjunto de formas geometricas (retangulos)
public class FormasGeometricas {

	// Lista de retangulos
	private List<Retangulo> listaRetangulos;

	public FormasGeometricas() {
		listaRetangulos = new ArrayList<Retangulo>();
	}

	/**
	 * Obter o retangulo com o maior perimetro
	 * @return Retangulo com o maior perimetro
	 */
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

	/**
	 * Obter o retangulo com a maior area
	 * @return Retangulo com a maior area
	 */
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

	/**
	 * Adicionar um retangulo a lista
	 * @param r - Retangulo a ser adicionado
	 */
	public void adicionarRetangulo(Retangulo r) {
		listaRetangulos.add(r);
	}

	/**
	 * Obter a lista de retangulos
	 * @return Lista de retangulos
	 */
	public List<Retangulo> obterListaRetangulos() {
		return listaRetangulos;
	}

}
