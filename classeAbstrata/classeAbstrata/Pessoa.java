package classeAbstrata;

public abstract class Pessoa {
	private String nome;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param nome
	 */
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
}
