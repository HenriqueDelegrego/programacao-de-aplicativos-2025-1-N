
public class Animal {

	private String raca;
	private String nome;
	private String porte;
	private String habitat;
	private String pais;

	public Animal(String raca, String nome, String porte, String habitat, String pais) {
		setRaca(raca);
		setNome(nome);
		setPorte(porte);
		setHabitat(habitat);
		setPais(pais);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Animal [raca=" + raca + ", nome=" + nome + ", porte=" + porte + ", habitat=" + habitat + ", pais="
				+ pais + "]";
	}

}
