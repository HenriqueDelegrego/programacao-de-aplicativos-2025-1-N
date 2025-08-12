
public class Ex1 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.nome = "Henrique";
		p1.sexo = 'M';
		p1.dataNascimento = "11/10/2001";
		p1.estadoCivil = "Solteiro";

		System.out.println(p1.nome + " nasceu em " + p1.dataNascimento);

		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		p2.sexo = 'F';
		p2.dataNascimento = "15/05/1998";
		p2.estadoCivil = "Casada";

	}

}
