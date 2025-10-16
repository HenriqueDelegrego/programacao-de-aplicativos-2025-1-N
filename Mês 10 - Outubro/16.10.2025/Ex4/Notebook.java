/**
 * Classe que representa um notebook e implementa a interface Dispositivo.
 */
public class Notebook implements Dispositivo {

	private String modelo;
	private int bateria;
	private boolean conectado;

	public Notebook(String modelo, int bateria, boolean conectado) {
		super();
		this.modelo = modelo;
		this.bateria = bateria;
		this.conectado = conectado;
	}

	/**
	 * Liga o notebook se estiver conectado ou se a bateria for maior que 10%.
	 * @return true se o notebook estiver ligado, false caso contrário.
	 */
	@Override
	public boolean ligar() {
		if (conectado || bateria > 10) {
			return true;
		}
		return false;
	}

	/**
	 * Desliga o notebook.
	 * @return true se o notebook estiver desligado, false caso contrário.
	 */
	@Override
	public boolean desligar() {
		return ligar();
	}

	/**
	 * Obtém o status do notebook.
	 * @return uma string indicando se o notebook está ligado ou desligado.
	 */
	@Override
	public String obterStatus() {
		if (ligar()) {
			return "O notebook está ligado";
		}
		return "O notebook está desligado";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

}
