package operadores;

public class Unario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preIncrementoOriginal = 8, preIncrementoResultado;  
		int posIncrementoOriginal = 8, posIncrementoResultado; 
		
		System.out.printf("Pré Incremento: valor original = %d%n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Apos pre incrementar é variavel ORIGINAL resultado: %d, valor atualizado = %d%n",preIncrementoResultado, preIncrementoOriginal);

		System.out.println();
		
		System.out.printf("Pré Incremento: valor original = %d%n", posIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("Apos pre incrementar é variavel ORIGINAL resultado: %d, valor atualizado = %d%n", posIncrementoResultado, posIncrementoOriginal);
	}

}
