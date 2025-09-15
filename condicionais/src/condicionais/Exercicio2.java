package condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite um numero");
		numero = leia.nextInt();
		
		if(numero%2==0 && numero < 0) {
			System.out.println("par e negativo");
		}
		else if(numero%2==0 && numero > 0){
			System.out.println("par e positivo");
		}
		else if(numero%2!=0 && numero < 0) {
			System.out.println("impar e negativo");
		}
		else {
			System.out.println("impar e positivo");
		}
		
		leia.close();
	}

}
