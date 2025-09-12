package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		//Instanciar um objeto da classe Scanner(entrada de dados)
		
		Scanner leia = new Scanner(System.in);
		
		// Definir as variaveis
		
		double numero1, numero2;
		
		// entrada de dados
		
		System.out.println("Digite um numero");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite outro numero");
		numero2 = leia.nextDouble();		
		
		// Efetuar os calculos
		//%n pula linha
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1+numero2);
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1-numero2);
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1*numero2);
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1/numero2);
	}

}
