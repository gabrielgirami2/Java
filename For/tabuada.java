package repeticao;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha o número da tabuada: ");
		int n = input.nextInt();
		
		for(int n1 = 1; n1 <= 10; n1++) {
			int prod = n1 *n;
			System.out.printf("%d x %d = %d \n", n, n1 , prod);
				
		}
		
		
	}
}
