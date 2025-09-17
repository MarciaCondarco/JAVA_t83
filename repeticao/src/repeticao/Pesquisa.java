package repeticao;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade, esporte, totalRespostas=0, futebol = 0, voleiM18 =0, basquetem=0;
		long somaIdades=0;
		double mediaIdade=0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte Favorito");
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1 - futebol");
			System.out.println("2 - volei");
			System.out.println("3 - basquete");
			
			System.out.println("Digite seu esporte favorito: ");
			esporte = leia.nextInt();
			
			//total de pessoas que gosta de futebol
			if(esporte==1) {
				futebol++;
			}
			//
			if(esporte == 2 && idade< 18) {
				voleiM18++;
			}
			
			if(esporte==3 && idade<18) {
				basquetem++;
			}
			
			somaIdades+=idade;
			
			totalRespostas++;
			
			System.out.println("Deseja continuar(S/N)");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		
		mediaIdade=Math.round(somaIdades/totalRespostas);
		
		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de volei maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de basquetem menores de 18 anos: %d%n", basquetem);
		System.out.printf("media das idades: %.2f%n", mediaIdade);
		
		leia.close();
	}

}
