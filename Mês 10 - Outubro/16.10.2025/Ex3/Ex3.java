
public class Ex3 {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro("Canis familiaris", 2, "Poodle");
		Gato g1 = new Gato("Siamês", 1.5, true);

		// Dependendo de qual objeto chamar, o método emitirSom() se comporta de forma diferente (Polimorfismo)
		System.out.println(c1.emitirSom());
		System.out.println(g1.emitirSom());

	}

}
