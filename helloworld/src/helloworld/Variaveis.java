package helloworld;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//scanner o metodo de entrada de dados no teclado
		
		System.out.println("digite um numero de peso");
		int peso = leia.nextInt();
		//ler valores inteiros 
		
		System.out.println("digite uma opcao: ");
		char opcao = leia.next().charAt(0);
		//o sero no charat pega o primeiro caractere
		
		System.out.println("digite um valor: ");
		float valor = leia.nextFloat(); 
		//no float precisa colocar o f no final do numero
		
		System.out.println("o valor da variavel peso é: " + peso);
		System.out.println("o valor da variavel opcao é: " + opcao);
		System.out.println("o valor da variavel valor é: " + valor);
		System.out.printf("o valor da variavel valor é: %.2f \n", valor);
		// %.2f -> dois é quantas casas decimais quero que sejam exibidas
		
		leia.close();
	}

}
