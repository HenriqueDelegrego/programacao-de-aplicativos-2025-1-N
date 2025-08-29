
public class OnibusEscolar {

	private int qtdAlunos;
	private int qtdProfessores;

	public OnibusEscolar(int qtdAlunos, int qtdProfessores) {
		setQtdAlunos(qtdAlunos);
		setQtdProfessores(qtdProfessores);
	}

	/**
	 * Adiciona alunos ao ônibus
	 * 
	 * @param qtdAdicao - Quantidade de alunos a serem adicionados
	 * @throws IllegalArgumentException se a quantidade for inválida
	 */
	public void retirarAlunos(int qtdRemocao) {
		if (qtdRemocao < 0) {
			throw new IllegalArgumentException("Quantidade a ser removida inválida");
		}
		setQtdAlunos(qtdAlunos - qtdRemocao);
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	/**
	 * Define a quantidade de alunos no ônibus
	 * 
	 * @param qtdAlunos - Quantidade de alunos (0 a 40)
	 * @throws IllegalArgumentException se a quantidade for inválida
	 */
	public void setQtdAlunos(int qtdAlunos) {
		if (qtdAlunos < 0) {
			throw new IllegalArgumentException("Quantidade de alunos não pode ser menor do que 0");
		}

		if (qtdAlunos > 40) {
			qtdAlunos = 40;
		}
		this.qtdAlunos = qtdAlunos;
	}

	public int getQtdProfessores() {
		return qtdProfessores;
	}

	/**
	 * Define a quantidade de professores no ônibus
	 * 
	 * @param qtdProfessores - Quantidade de professores (0 ou mais)
	 * @throws IllegalArgumentException se a quantidade for inválida
	 */
	public void setQtdProfessores(int qtdProfessores) {
		if (qtdProfessores < 0) {
			throw new IllegalArgumentException("Quantidade de professores inválida");
		}
		if (qtdProfessores == 0) {
			setQtdAlunos(0);
		}
		this.qtdProfessores = qtdProfessores;
	}

}
