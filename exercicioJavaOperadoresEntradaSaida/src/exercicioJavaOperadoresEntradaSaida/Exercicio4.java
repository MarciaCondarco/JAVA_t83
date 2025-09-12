package exercicioJavaOperadoresEntradaSaida;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,n4, resultado;
		
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo numero");
		n2 = leia.nextFloat();
		System.out.println("Digite o terceiro numero");
		n3 = leia.nextFloat();
		System.out.println("Digite o quarto numero");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2)-(n3*n4);
		
		System.out.printf("a diferença entre o n1 e n2 com n3 e n4 é: %.1f", resultado);
		
	}

}
