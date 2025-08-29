
public class Ex10 {

	public static void main(String[] args) {

		OnibusEscolar o1 = new OnibusEscolar(20, 5);

		System.out.println(o1.getQtdAlunos());

		o1.retirarAlunos(15);

		System.out.println(o1.getQtdAlunos());

	}

}
