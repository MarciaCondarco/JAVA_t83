package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = {"Cintia", "Stella", "Patricia", "MARCIA"};
		
		int numeros[] = new int[3];
		
		System.out.println("Listagem vetor de nomes");
		
		//sort -> ordenar em ordem alfabetica
		Arrays.sort(nomes);
		
		Arrays.sort(nomes, Collections.reverseOrder());
		
		for(int indice = 0; indice < nomes.length;indice++) {
			System.out.printf("Posição %d = %s%n", indice, nomes[indice]);
			
		}
		
		System.out.println("\n Listagem input de dados");
		//listagem dos input no vetor numero que está vazio
		for(int indice = 0; indice < numeros.length;indice++) {
		
			System.out.println("Digite um numero: ");
			numeros[indice] = leia.nextInt();
		}
		System.out.println("\n Listagem vetor de numero");
		
		//armazena os dados e listagem, o vetor numeros que antes estava vazio agora esta preenchido
		for(int indice = 0; indice < numeros.length;indice++) {
			System.out.printf("Posição %d = %s%n", indice, numeros[indice]);
		}
		

	}

}
