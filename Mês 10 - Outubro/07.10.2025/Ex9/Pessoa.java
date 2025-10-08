import java.time.LocalDate;

public class Pessoa {

	private String nome;

	// Objeto da classe LocalDate representa uma data (ano, mês, dia) sem fuso horário
	private LocalDate dataNascimento;

	public Pessoa(String nome, LocalDate dataNascimento) {
		setNome(nome);
		setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		// Verifica se a data de nascimento é nula ou se é uma data futura
		// Se for, lança uma exceção
		if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de nascimento inválida");
		}
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
	
	

}
