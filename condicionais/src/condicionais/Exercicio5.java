package condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, quantidade;

		System.out.println("=================================");
		System.out.println("COD 	  PRODUTO 	       PREÇO ");
		System.out.println("1     cachorro quente    R$ 10.00");
		System.out.println("2  	     X-salada        R$ 15.00");
		System.out.println("3     	 x-bacon         R$ 18.00");
		System.out.println("4         Bauru          R$ 12.00");
		System.out.println("5      Refrigerante      R$ 8.00");
		System.out.println("6     cachorro quente    R$ 13.00");
		System.out.println("=================================");

		System.out.println("qual produto deseja? obs. selecione apenas o código");
		numero = leia.nextInt();

		System.out.println("Qual a quantidade desse produto que");
		quantidade = leia.nextInt();

		switch (numero) {

		case 1:
			System.out.printf("o valor total é: " + quantidade * 10);
			break;
		case 2:
			System.out.printf("o valor total é: ", quantidade * 15);
			break;
		case 3:
			System.out.printf("o valor total é: ", quantidade * 18);
			break;
		case 4:
			System.out.printf("o valor total é: ", quantidade * 12);
			break;
		case 5:
			System.out.printf("o valor total é: ", quantidade * 8);
			break;
		case 6:
			System.out.printf("o valor total é: ", quantidade * 13);
			break;
		}
		leia.close();
	}

}
