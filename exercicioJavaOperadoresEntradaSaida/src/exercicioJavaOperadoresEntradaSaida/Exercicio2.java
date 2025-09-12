package exercicioJavaOperadoresEntradaSaida;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4,calcularMedia;
		
		System.out.println("Digite a nota do aluno: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a nota do aluno: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a nota do aluno: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a nota do aluno: ");
		nota4 = leia.nextFloat();
		
		calcularMedia = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média final do aluno é: %.1f", calcularMedia);
		
		
		
	}

}
