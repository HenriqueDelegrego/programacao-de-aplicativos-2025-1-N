
public class Empregado {

	String identificacao;
	String nome;
	String sobrenome;
	double salario;

	public double obterSalarioAnual() {
		return salario * 12;
	}

	public String obterNomeCompleto() {
		return nome + " " + sobrenome;
	}

	public void aumentarSalario(double percentualAumento) {
		salario = salario + (salario * (percentualAumento / 100));
	}

}
