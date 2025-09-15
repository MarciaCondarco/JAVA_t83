package condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2 ,numero3,resultado;
		
		System.out.println("Digite um numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite mais um numero");
		numero2 = leia.nextInt();
		
		System.out.println("Digite outro numero");
		numero3 = leia.nextInt();
		
		resultado = numero1 + numero2;
		if(resultado >= numero3) {
			System.out.printf("a resultado é maior que o valor C: %.2f", numero3);
		}
		else if(resultado == numero3) {
			System.out.printf("a resultado é igual a variavel c ");
		}
		else {
			System.out.printf("a resultado é menor da variavel c");
		}
		
		leia.close();
		
		
	}

}
