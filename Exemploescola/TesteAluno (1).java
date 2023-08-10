package Revisao;

public class TesteAluno {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno();
		System.out.println("Sua matrícula é: " + a1.setmatricula(1553));
		System.out.println("Seu nome é: " + a1.setnome("João"));
		System.out.println("Sua data de nascimento é: " + a1.setdatadenascimento("15/02/2004"));
		System.out.println("Seu endereço é: " + a1.setendereco("Rua João Bley Filho"));
		System.out.println("O seu telefone é: " + a1.settelefone(995778161));
		System.out.println("O seu curso é: " + a1.setcurso("ADS"));
		System.out.println("O seu período de curso é: " + a1.setperiodo("Noturno"));
		
	}
}
