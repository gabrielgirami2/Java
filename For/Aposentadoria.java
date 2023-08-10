package repeticao;

import java.util.Scanner;

public class Aposentadoria {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor meta para aposentadoria: ");
		float meta = input.nextFloat();
		
		System.out.println("Insira o valor que deseja guardar mensalmente: ");
		float mensal = input.nextFloat();
		
		
		System.out.println("Insira a taxa de juros mensal: ");
		float taxa = input.nextFloat();
		
		
		float juros = mensal + (mensal * (taxa/100));
		int tempo = 0;
					
		
		for(float i = juros; i <= meta; i+= juros );
		System.out.println(juros);
				

	}

}
