import java.util.ArrayList;
import java.util.List;

public class Floricultura {

	// Lista de flores
	private List<Flor> listaFlores;

	public Floricultura() {
		listaFlores = new ArrayList<Flor>();
	}

	/**
	 * Obtém a flor mais cara da lista
	 * 
	 * @return Flor mais cara
	 */
	public Flor obterFlorMaisCara() {
		double maiorValor = Double.MIN_VALUE;
		Flor florMaisCara = null;

		for (Flor f : listaFlores) {
			if (f.getPreco() > maiorValor) {
				maiorValor = f.getPreco();
				florMaisCara = f;
			}
		}

		return florMaisCara;
	}

	/**
	 * Compara a receita obtida com flores para presente e para não presente
	 * 
	 * @return String indicando qual receita foi maior ou se foram iguais
	 */
	public String receitaMaiorPresenteOuNao() {
		double receitaPresente = 0;
		double receitaNaoPresente = 0;
		for (Flor f : listaFlores) {
			if (f.isPresente()) {
				receitaPresente += f.getPreco();
			} else {
				receitaNaoPresente += f.getPreco();
			}
		}

		if (receitaPresente > receitaNaoPresente) {
			return "Vendeu mais para presentes";
		} else if (receitaNaoPresente > receitaPresente) {
			return "Vendeu mais para não presente";
		} else {
			return "Vendas iguais";
		}
	}

	/**
	 * Adiciona uma flor na lista
	 * 
	 * @param f - flor a ser adicionada
	 */
	public void adicionarFlor(Flor f) {
		listaFlores.add(f);
	}

	/**
	 * Obtém a lista de flores
	 * 
	 * @return lista de flores
	 */
	public List<Flor> obterListaFlores() {
		return listaFlores;
	}

}
