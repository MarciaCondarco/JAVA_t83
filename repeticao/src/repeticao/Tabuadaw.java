package repeticao;

import java.util.Scanner;

public class Tabuadaw {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		int contador = 1;
		System.out.println("Digite um numero");
		numero = leia.nextInt();
		
		
		while(contador<=10) {
			System.out.printf("%d X %d = %d%n", numero, contador, numero*contador);
			contador++;
		}
		
		leia.close();

	}

}
