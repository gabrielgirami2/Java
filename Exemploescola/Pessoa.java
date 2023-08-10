package Revisao;

public class Pessoa {
	
	//Construtor default
	public Pessoa() {
		}
	
	
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Construtor Pessoa = Objeto
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;

	}
	

		//Acessores e Modificadores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
}
	
//Métodos
	public String setnome (String n) {
		return n;
	}
	public int setidade (int i) {
		return i;
	}
	public String setsexo (String s) {
		return s;
	} 
	
	}


	