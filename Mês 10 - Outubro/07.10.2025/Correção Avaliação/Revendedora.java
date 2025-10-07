import java.util.ArrayList;
import java.util.List;

public class Revendedora {

	private List<Carro> listaCarros;

	public Revendedora() {
		listaCarros = new ArrayList<Carro>();
	}

	public Carro obterCarroMaisCaroAno(int ano) {
		Carro carroMaisCaro = null;
		double maisCaro = 0;

		for (Carro c : listaCarros) {
			if (c.getAno() == ano && c.getPreco() > maisCaro) {
				maisCaro = c.getPreco();
				carroMaisCaro = c;
			}
		}
		return carroMaisCaro;
	}

	public List<Carro> obterCarrosMarcaEPreco(String marca, double precoMinimo, double precoMaximo) {
		List<Carro> listaCarrosPorAnoEPreco = new ArrayList<Carro>();

		for (Carro c : listaCarros) {
			if (c.getMarca().equalsIgnoreCase(marca) && (c.getPreco() >= precoMinimo && c.getPreco() <= precoMaximo)) {
				listaCarrosPorAnoEPreco.add(c);
			}
		}

		return listaCarrosPorAnoEPreco;
	}

	public void adicionarCarro(Carro c) {
		listaCarros.add(c);
	}

	public List<Carro> obterListaCarros() {
		return listaCarros;
	}
}
