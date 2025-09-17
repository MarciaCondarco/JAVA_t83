package repeticao;

import java.util.Scanner;

public class Exercicio1repe {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite um numero do intervalo de 10 a 100");
		numero1 = leia.nextInt();
		
		System.out.println("Digite outro numero do intervalo de 10 a 100");
		numero2 = leia.nextInt();
		
		if(numero1<numero2) {
			
		}
		else {
			System.out.println("intervalo invalido");
		}
		
		leia.close();

	}

}
