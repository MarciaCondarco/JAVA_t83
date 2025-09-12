package exercicioJavaOperadoresEntradaSaida;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//entrada de dados
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		System.out.println("Digite o salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite  o abono");
		abono = leia.nextFloat();
		
		System.out.printf("o novo salario é:  %.2f", salario+abono);
		
	}

}
