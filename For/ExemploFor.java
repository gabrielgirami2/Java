package repeticao;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Antes do FOR");
		
		System.out.println("Inicio: ");
		int inicio = input.nextInt();
		System.out.println("Fim: ");
		int fim = input.nextInt();
		
		
		for(int i = inicio; i < fim; i++) {
			if(i%2 == 0)
			System.out.println("é par: " + i);
		}
		
		for(int j = inicio; j > fim; j--) {
			if(j%2 != 0)
			System.out.println("é impar: " + j);	
			
		}
		
		System.out.println("Depois do FOR");
		
	}
}
