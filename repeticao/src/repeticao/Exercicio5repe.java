package repeticao;

import java.util.Scanner;

public class Exercicio5repe {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros;
		int contador = 0;
		String continua ="S";
		
		do {
			System.out.println("digite um numero");
			numeros = leia.nextInt();
			contador = contador + numeros;
			System.out.println("Deseja continuar(S/N)");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}while(numeros==0); {
			System.out.printf("A soma dos numeros positivos é: %d", contador);
		}
		

	}

}
