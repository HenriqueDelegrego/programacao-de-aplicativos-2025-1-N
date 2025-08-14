
public class Ex5 {

	public static void main(String[] args) {

		Empregado e1 = new Empregado();

		e1.identificacao = "378383";
		e1.nome = "Maria";
		e1.sobrenome = "Souza";
		e1.salario = 1000;

		System.out.println(e1.obterSalarioAnual());
		System.out.println(e1.obterNomeCompleto());

		e1.aumentarSalario(10);

		System.out.println(e1.salario);

	}

}
