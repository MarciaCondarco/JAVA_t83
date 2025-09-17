package vetores;

import java.util.Scanner;

public class Exerciciovetor1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int numerovetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int linha =0 ;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		for ( linha = 0; linha < numerovetor.length; linha++) {
			if(numero == numerovetor[linha]) {
				System.out.printf("O número %d está localizado na posição: %d",numero, linha);
			}
		}

		leia.close();

	}

}
