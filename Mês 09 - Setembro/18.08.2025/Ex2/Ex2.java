
public class Ex2 {

	public static void main(String[] args) {

		Flor f1 = new Flor("Rosa", 5, "João", true);
		Flor f2 = new Flor("Jasmin", 6, "Ana", false);
		Flor f3 = new Flor("Azaleia", 7, "Maria", false);
		Flor f4 = new Flor("Margarida", 7, "Carlos", true);

		Floricultura floricultura = new Floricultura();

		floricultura.adicionarFlor(f1);
		floricultura.adicionarFlor(f2);
		floricultura.adicionarFlor(f3);
		floricultura.adicionarFlor(f4);

		System.out.println(floricultura.obterFlorMaisCara());

		System.out.println(floricultura.receitaMaiorPresenteOuNao());

	}

}
