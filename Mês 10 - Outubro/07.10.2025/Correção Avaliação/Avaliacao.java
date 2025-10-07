public class Avaliacao {
	public static void main(String[] args) {

		// Criação dos carros conforme os dados fornecidos
		Carro c1 = new Carro("Volkswagen", "Gol", "FTX2A45", 2010, 23000);
		Carro c2 = new Carro("Chevrolet", "Onix", "JKM9B12", 2015, 38000);
		Carro c3 = new Carro("Honda", "Civic", "LPR4C67", 2010, 34000);
		Carro c4 = new Carro("Chevrolet", "Cruze", "QWE7D89", 2019, 78000);
		Carro c5 = new Carro("Volkswagen", "Polo", "ZTR1F23", 2019, 58000);

		// Criação da revendedora
		Revendedora r = new Revendedora();

		// Inserção dos carros fornecidos
		r.adicionarCarro(c1);
		r.adicionarCarro(c2);
		r.adicionarCarro(c3);
		r.adicionarCarro(c4);
		r.adicionarCarro(c5);

		System.out.println(r.obterCarroMaisCaroAno(2010) + "\n");
		System.out.println(r.obterCarrosMarcaEPreco("Volkswagen", 20000, 59000) + "\n");

		System.out.println(c1.calcularDepreciacao(2029));

	}
}
