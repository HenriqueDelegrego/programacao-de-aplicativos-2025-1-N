
public class Ex1 {

	public static void main(String[] args) {

		Retangulo r1 = new Retangulo(4, 5);
		Retangulo r2 = new Retangulo(2, 3);
		Retangulo r3 = new Retangulo(1, 3);
		Retangulo r4 = new Retangulo(2, 9);

		FormasGeometricas f1 = new FormasGeometricas();

		f1.adicionarRetangulo(r1);
		f1.adicionarRetangulo(r2);
		f1.adicionarRetangulo(r3);
		f1.adicionarRetangulo(r4);

		System.out.println(f1.obterRetanguloMaiorArea());
		System.out.println(f1.obterRetanguloMaiorPerimetro());

	}

}
