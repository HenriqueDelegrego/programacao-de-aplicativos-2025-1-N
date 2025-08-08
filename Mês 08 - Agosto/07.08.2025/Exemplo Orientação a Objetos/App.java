
public class App {

	public static void main(String[] args) {
		// Criando um objeto do tipo Veiculo
		Veiculo v1 = new Veiculo();

		// Atribuindo valores aos atributos do veículo
		v1.modelo = "Honda Civic";
		v1.comprimento = 4.7;
		v1.passageiros = 5;
		v1.velMax = 200;
		v1.cor = "Preto";

		// Exibindo o modelo do veículo
		System.out.println(v1.modelo);

	}

}
