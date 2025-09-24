
public class Item {

	private String nome;
	private double preco;
	private int qtdEstoque;

	public Item(String nome, double preco, int qtdEstoque) {
		setNome(nome);
		setPreco(preco);
		setQtdEstoque(qtdEstoque);
	}

	public void adicionarPecaAoEstoque(int qtdPecas) {
		if (qtdPecas <= 0) {
			throw new IllegalArgumentException("Quantidade de peças a ser adicionada está inválida");
		}
		qtdEstoque += qtdPecas;
	}

	public void venderProduto(int qtdVenda) {
		if (qtdVenda <= 0) {
			throw new IllegalArgumentException("Quantidade a ser vendida inválida");
		}

		if (qtdVenda > qtdEstoque) {
			throw new IllegalArgumentException(
					"Quantida a ser vendida não pode ser maior do que quantidade em estoque");
		}

		qtdEstoque -= qtdVenda;
	}

	public void aplicarDesconto(double desconto) {
		double porcentagemDesconto = desconto / 100;

		preco -= preco * porcentagemDesconto;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0) {
			throw new IllegalArgumentException("Quantidade de estoque inválida");
		}
		this.qtdEstoque = qtdEstoque;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + "]";
	}

}
