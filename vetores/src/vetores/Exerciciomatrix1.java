package vetores;

import java.util.Scanner;

public class Exerciciomatrix1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero[][] = new int[3][3];
		String diagonalPrincipal = "", diagonalSecundario = "";
		int somaPrincipal = 0, somaSecundario = 0;
		int coluna = 0;

		for (int linha = 0; linha < numero.length; linha++) {
			// coluna menor que numero na posição de linha em tamanho
			for (coluna = 0; coluna < numero[linha].length; coluna++) {
				System.out.printf("Digite um numero:[%d][%d]", linha, coluna);
				numero[linha][coluna] = leia.nextInt();
			}
		}
		for(int indice = 0; indice<numero.length;indice++) {
			diagonalPrincipal += numero[indice][indice] + " ";
			somaPrincipal += numero[indice][indice]; 
		}
		//diagonal principal 
		
		//diagonal secundario
		
		for(int indice = 0; indice<numero.length;indice++) {
			//tamanho da matrix é 3 (0 1 2) - 1 - 0 
			diagonalSecundario += numero[indice][numero.length - 1 - indice] + " ";
			somaSecundario += numero[indice][numero.length - 1 - indice]; 
		}
		
		System.out.println("Diagonal principal: " + diagonalPrincipal);
		System.out.println("Diagonal Secundario: " + diagonalSecundario);
		System.out.println("Soma dos elementos diagonal principal: " + somaPrincipal);
		System.out.println("Soma dos elementos diagonal secundario: " + somaSecundario);
		
		leia.close();
	}

}
