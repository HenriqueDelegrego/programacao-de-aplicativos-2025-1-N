import java.time.LocalDate;

public class Ex9 {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Henrique", LocalDate.of(2001, 10, 11));

		Pessoa p2 = new Pessoa("Marcos", LocalDate.of(1985, 2, 27));

		Pessoa p3 = new Pessoa("Ana", LocalDate.of(2005, 5, 8));

		Familia f1 = new Familia();

		f1.adicionarPessoa(p1);
		f1.adicionarPessoa(p2);
		f1.adicionarPessoa(p3);

		System.out.println(f1.encontrarPessoaMaisVelha());

	}
}
