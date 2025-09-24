import java.util.ArrayList;
import java.util.List;

public class Loja {

	private List<Item> listaItens;

	public Loja() {
		listaItens = new ArrayList<Item>();
	}

	public Item obterItemMaisCaro() {
		double maiorValor = 0;
		Item iMaisCaro = null;

		for (Item i : listaItens) {
			if (i.getPreco() > maiorValor) {
				maiorValor = i.getPreco();
				iMaisCaro = i;
			}
		}
		return iMaisCaro;
	}

	// Create
	public void adicionarItens(Item i) {
		listaItens.add(i);
	}

	// Read
	public List<Item> obterListaItens() {
		return listaItens;
	}

}
