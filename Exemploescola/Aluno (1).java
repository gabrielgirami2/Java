package Revisao;

public class Aluno {

	
	//Construtor default
	public Aluno() {
	}
	
	//Atributos
	private int matricula;
	private String nome;
	private int datanascimento;
	private String endereco;
	private String telefone;
	private String curso;
	private String periodo;
	
	//Construtor Aluno = objeto
	public Aluno(int matricula, String nome, int datanascimento, String endereco, String telefone, String curso, String periodo) {
	this.matricula = matricula;
	this.nome = nome;
	this.datanascimento = datanascimento;
	this.endereco = endereco;
	this.telefone = telefone;
	this.curso = curso;
	this.periodo = periodo;
	}

	//Acessores e Modificadores
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(int datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	//Métodos
	public int setmatricula (int m) {
		return m;	
	}
	public String setnome (String n) {
		return n;	
	}
	public String setdatadenascimento (String string) {
		return string;	
	}
	public String setendereco (String e) {
		return e;	
	}
	public int settelefone (int t) {
		return t;	
	}
	public String setcurso (String c) {
		return c;	
	}
	public String setperiodo (String p) {
		return p;	
	}
	
}
