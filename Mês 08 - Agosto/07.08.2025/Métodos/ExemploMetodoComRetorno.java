
public class ExemploMetodoComRetorno {

	public static void main(String[] args) {

		int valor1 = 5;
		int valor2 = 7;

		int produto = multiplicarValores(valor1, valor2);
		System.out.println(produto);

	}

	public static int multiplicarValores(int valor1, int valor2) {
		// Return sempre será a última ação do método
		// Todo método que não é void deve ter um return
		return valor1 * valor2;		
	}

}
