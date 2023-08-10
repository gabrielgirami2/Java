package ddd;

import java.util.Date;

public class Professor extends Pessoa{
	//Atributos
	private double salario;
	private String disciplina;
	
	
	//Construtor
	public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
		super(nome, cpf, dataNascimento);
		this.salario = salario;
		this.disciplina = disciplina;
	}


	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}


	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}


	/**
	 * @return the disciplina
	 */
	public String getDisciplina() {
		return disciplina;
	}


	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
	
}
