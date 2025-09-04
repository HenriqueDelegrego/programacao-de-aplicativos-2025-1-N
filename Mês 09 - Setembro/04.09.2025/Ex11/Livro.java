
public class Livro {

	private String titulo;
	private boolean emprestado;

	public Livro(String titulo, boolean emprestado) {
		setTitulo(titulo);
		setEmprestado(emprestado);
	}

	public void emprestar() {

		if (isEmprestado()) {
			throw new IllegalArgumentException("Livro já emprestado");
		}

		emprestado = true;
	}

	public void devolver() {

		if (!isEmprestado()) {
			throw new IllegalArgumentException("Livro não está emprestado");
		}

		emprestado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("Título inválido");
		}
		this.titulo = titulo;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	@Override
	public String toString() {
		if (isEmprestado()) {
			return "Livro titulo=" + titulo + " (emprestado)";

		}
		return "Livro titulo=" + titulo + " (não emprestado)";
	}

}
