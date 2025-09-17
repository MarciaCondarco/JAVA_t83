package vetores;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		int numeros [][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			
		};
		
		//matriz irregular
		float numerosReais[][]=new float[3][2];
		
		//for externo percorre as linhas
		for (int linha=0 ; linha< numeros.length; linha++) {
			
			// for interno percorre as colunas
			for(int coluna=0; coluna< numeros.length;coluna++) {
				//a primeira [] é as linha, o segundo [] é as colunas
				System.out.printf("numeros[%d][%d] = %d%n", linha, coluna, numeros[linha][coluna]);
			}
		}
		
	}

}
