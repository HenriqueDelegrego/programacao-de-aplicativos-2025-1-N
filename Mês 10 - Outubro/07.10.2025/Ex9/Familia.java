import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Familia {

	private List<Pessoa> listaPessoas;

	public Familia() {
		listaPessoas = new ArrayList<Pessoa>();
	}

	/**
	 * Encontra a pessoa mais velha da lista
	 * @return Pessoa mais velha ou null se a lista estiver vazia
	 */
	public Pessoa encontrarPessoaMaisVelha() {
		Pessoa pessoaMaisVelha = null;
		LocalDate dataMaisVelha = LocalDate.now();

		for (Pessoa p : listaPessoas) {
			if (p.getDataNascimento().isBefore(dataMaisVelha)) {
				dataMaisVelha = p.getDataNascimento();
				pessoaMaisVelha = p;
			}
		}
		return pessoaMaisVelha;

	}

	public void adicionarPessoa(Pessoa p) {
		listaPessoas.add(p);
	}

	public List<Pessoa> obterListaPessoas() {
		return listaPessoas;
	}

}
