/**
 * Interface que define o comportamento de um dispositivo.
 */
public interface Dispositivo {

	/**
	 * Liga o dispositivo.
	 * @return true se o dispositivo estiver ligado, false caso contrário.
	 */
	boolean ligar();

	/**
	 * Desliga o dispositivo.
	 * @return true se o dispositivo estiver desligado, false caso contrário.
	 */
	boolean desligar();

	/**
	 * Obtém o status do dispositivo.
 	 * @return uma string indicando o status do dispositivo.
	 */
	String obterStatus();

}
