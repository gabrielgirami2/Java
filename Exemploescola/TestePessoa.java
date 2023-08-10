package Revisao;

public class TestePessoa {

	//Reconheceu objeto e atribuimos uma forma de usar o objeto
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		System.out.println("Seu nome é: " + p1.setnome("Gabriel"));
		System.out.println("Seu sexo é: " + p1.setsexo("Masculino"));
		System.out.println("Sua idade é: " + p1.setidade(17));
		
	}
	
}
