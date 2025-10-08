import java.time.LocalDate;

public class Pessoa {

	private String nome;

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
