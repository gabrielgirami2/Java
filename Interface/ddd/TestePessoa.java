package ddd;

import java.util.Date;

public class TestePessoa {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("João", "123.321.123-23", new Date(), "98014", "ADS", 1500);
		System.out.println("Aluno: " + aluno.toString());
	}

}
