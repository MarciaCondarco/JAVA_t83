package vetores;

import java.util.Scanner;

public class Exerciciovetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		int matriz[]=new int[9];
		
		for(int i = 0; numero > matriz.length; i ++){
			
			System.out.println("Digite um numero");
			numero = leia.nextInt();
			
			for ( int linha = 0; linha < matriz.length; linha++) {
				for(int coluna = 0; linha < matriz.length; coluna++) {
					if(numero == matriz[linha]) {
						System.out.printf("Elementos nos índices ímpares:%d ",linha, coluna, matriz[linha][coluna]);
					}
				}
			}
		}
		

	}

}
