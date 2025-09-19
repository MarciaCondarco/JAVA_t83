package metodos;

import java.util.Scanner;

public class CalculadoraMetodo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Definir as variaveis

		double numero1, numero2, resultadoDivisao;

		// entrada de dados

		System.out.println("Digite um numero");
		numero1 = leia.nextDouble();

		System.out.println("Digite outro numero");
		numero2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, somar(numero1, numero2));
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, multiplicacao(numero1, numero2));
		resultadoDivisao = divisao(numero1, numero2);
		
		if(resultadoDivisao == -1) {
			System.out.println("Não existe divisão por zero");
			System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, resultadoDivisao);
		}
		else {
			System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, resultadoDivisao);
			
		}
		
		sobre();
		leia.close();

	}
	
	public static double somar(double a, double b) {
		return a + b;
	}
	public static double subtrair(double a, double b) {
		return a - b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	public static double divisao(double a, double b) {
		
		if(b == 0) {
			return -1;
		}
		return a / b;
	}
	public static void sobre() {
		System.out.println("\n==========================");
		System.out.println("Calculadora desenvolvida por: Marcia Condarco");
		System.out.println("==========================");
	}

}
