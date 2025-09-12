package exercicioJavaOperadoresEntradaSaida;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, Descontos, salarioLiquido;
		
		System.out.println("Digite o salario bruto:");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno:");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite o horas extras:");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o descontos:");
		Descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) -Descontos;
		System.out.printf("o salario liquido é: %.2f", salarioLiquido);

	}

}
