import java.util.ArrayList;
import java.util.List;

public class Floricultura {

	private List<Flor> listaFlores;

	public Floricultura() {
		listaFlores = new ArrayList<Flor>();
	}

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

	public void adicionarFlor(Flor f) {
		listaFlores.add(f);
	}

	public List<Flor> obterListaFlores() {
		return listaFlores;
	}

}
