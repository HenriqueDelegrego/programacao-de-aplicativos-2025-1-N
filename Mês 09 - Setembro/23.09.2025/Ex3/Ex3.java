
public class Ex3 {

	public static void main(String[] args) {

		// Criação dos objetos de Item
		Item i1 = new Item("Martelo", 20, 50);
		Item i2 = new Item("Trena a laser", 400, 100);

		// Criação do objeto Loja
		Loja l1 = new Loja();

		// Adicionando os itens à loja
		l1.adicionarItens(i1);
		l1.adicionarItens(i2);

		i1.adicionarPecaAoEstoque(10);

		System.out.println(i1);

		i1.venderProduto(5);

		System.out.println(i1);

		i1.aplicarDesconto(10);

		System.out.println(i1);

		System.out.println(l1.obterItemMaisCaro());

	}

}
