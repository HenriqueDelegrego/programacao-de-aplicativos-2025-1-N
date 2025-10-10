
public class GatoSelvagem extends Animal {

	private String corPelagem;

	private String corManchas;

	public GatoSelvagem(String raca, String nome, String porte, String habitat, String pais, String corPelagem,
			String corManchas) {
		super(raca, nome, porte, habitat, pais);
		this.corPelagem = corPelagem;
		this.corManchas = corManchas;
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	public String getCorManchas() {
		return corManchas;
	}

	public void setCorManchas(String corManchas) {
		this.corManchas = corManchas;
	}

	@Override
	public String toString() {
		return super.toString() + " GatoSelvagem [corPelagem=" + corPelagem + ", corManchas=" + corManchas + "]";
	}

}
