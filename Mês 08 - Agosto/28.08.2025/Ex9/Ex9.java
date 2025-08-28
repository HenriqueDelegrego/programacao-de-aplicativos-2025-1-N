
public class Ex9 {

	public static void main(String[] args) {

		Carro c1 = new Carro(50);

		System.out.println(c1.getVelocidade());

		c1.acelerar(15);

		System.out.println(c1.getVelocidade());

		c1.reduzir(20);

		System.out.println(c1.getVelocidade());

	}

}
