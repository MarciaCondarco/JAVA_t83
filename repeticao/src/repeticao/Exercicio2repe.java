package repeticao;

import java.util.Scanner;

public class Exercicio2repe {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero=0;
		int contador = 0;
		int f = 0;
		int i = 0;
		
		for(f = 1; f<=10; f++) {
			System.out.printf("Digite o %d numero: ",f);
			numero=leia.nextInt();
			if(numero%2==0) {
				contador++;
			}
			else {
				i++;
			}
		}

		
		System.out.printf("A quantidade de numeros par é: %d%n", contador);
		System.out.printf("A quantidade de numeros impar é: %d%n", i);
		
		leia.close();
	}

}
