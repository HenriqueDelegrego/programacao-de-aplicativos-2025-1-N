
public class Ex4 {

	public static void main(String[] args) {

		Conta c1 = new Conta("Henrique", 1000);
		Conta c2 = new Conta("Golle", 5000);

		c1.transferir(c2, 500);

		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());

		System.out.println(c1.simularInvestimento(400, 5));

	}

}
