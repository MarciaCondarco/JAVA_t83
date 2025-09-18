package colecoes;

import java.util.ArrayList;
import java.util.Scanner;


public class Exerciciocolecao1 {

	public static void main(String[] args) {
			
		
		Scanner leia = new Scanner(System.in);
		
		String cor = "";

		ArrayList<String> corList = new ArrayList<String>();
		for(int i = 1; i<=5 ; i++) {
			
			System.out.printf("Insira o %dº cor: ", i);
			cor = leia.nextLine();
			corList.add(cor);
		}
		
		System.out.printf("Listar todas as cores: ");
		System.out.println(corList);
		System.out.printf("Ordenar as cores: ");
		corList.sort(null);
		System.out.println(corList);
		leia.close();
		
		
		
	}

}
