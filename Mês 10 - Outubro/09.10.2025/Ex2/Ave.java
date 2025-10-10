
public class Ave extends Animal {

	private String corPena;

	private String tipoAlimentacao;

	public Ave(String raca, String nome, String porte, String habitat, String pais, String corPena,
			String tipoAlimentacao) {
		super(raca, nome, porte, habitat, pais);
		this.corPena = corPena;
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	@Override
	public String toString() {
		return "Ave [corPena=" + corPena + ", tipoAlimentacao=" + tipoAlimentacao + "]";
	}

}
