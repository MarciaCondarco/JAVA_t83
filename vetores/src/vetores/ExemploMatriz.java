package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};
		System.out.println("\n Listar os dados - matriz numeros ");
		// matriz irregular
		float numerosReais[][] = new float[3][2];

		// for externo percorre as linhas
		for (int linha = 0; linha < numeros.length; linha++) {

			// for interno percorre as colunas
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				// a primeira [] é as linha, o segundo [] é as colunas
				System.out.printf("numeros[%d][%d] = %d%n", linha, coluna, numeros[linha][coluna]);
			}
		}
		//////////////////////entrada de dados
		System.out.println("Input dos dados - matriz de numeros reais");
		for (int linha = 0; linha < numerosReais.length; linha++) {

			// for interno percorre as colunas
			for (int coluna = 0; coluna < numerosReais[linha].length; coluna++) {
				// a primeira [] é as linha, o segundo [] é as colunas
				System.out.println("Digite um numero: ");
				numerosReais[linha][coluna] = leia.nextFloat();
			}
		}
		/////////////exibir
		System.out.println("\n Listar os dados - matriz numeros reais");
		for (int linha = 0; linha < numerosReais.length; linha++) {
			
			// for interno percorre as colunas
			for (int coluna = 0; coluna < numerosReais[linha].length; coluna++) {
				// a primeira [] é as linha, o segundo [] é as colunas
				System.out.printf("numeros[%d][%d] = %f%n", linha, coluna, numerosReais[linha][coluna]);
			}
		}
		leia.close();
	}

}
