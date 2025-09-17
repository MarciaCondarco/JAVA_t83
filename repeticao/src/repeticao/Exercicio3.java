package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade=0;
		int f = 0;
		int i =0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade <= 21 ) {
				f++;
			}
			if(idade >=50) {
				i++;
			}
			
			System.out.println("Deseja continuar(S/N)");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d%n",f);
		System.out.printf("Total de pessoas maiores de 50 anos: %d",i);
		
		
		leia.close();
	}

}
