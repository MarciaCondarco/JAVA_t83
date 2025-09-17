package repeticao;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao =0;
		
		do {
			System.out.println("digite uma opção");
			opcao=leia.nextInt();
		}while(opcao==0);
		
		leia.close();
	}

}
