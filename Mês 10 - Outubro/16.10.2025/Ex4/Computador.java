/**
 * Classe que representa um computador e implementa a interface Dispositivo.
 */
public class Computador implements Dispositivo {

	private String modelo;

	private boolean conectado;

	public Computador(String modelo, boolean conectado) {
		super();
		this.modelo = modelo;
		this.conectado = conectado;
	}

	/**
	 * Liga o computador se estiver conectado.
	 * @return true se o computador estiver ligado, false caso contrário.
	 */
	@Override
	public boolean ligar() {
		return conectado;
	}

	/**
	 * Desliga o computador.
	 * @return true se o computador estiver desligado, false caso contrário.
	 */
	@Override
	public boolean desligar() {
		return ligar();
	}

	/**
	 * Obtém o status do computador.
	 * @return uma string indicando se o computador está ligado ou desligado.
	 */
	@Override
	public String obterStatus() {
		if (ligar()) {
			return "O computador está ligado";
		}
		return "O computador está desligado";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

}
