package condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		boolean decisao;
		int idade;
		
		System.out.println("Qual seu nome?");
		nome = leia.nextLine();
		
		System.out.println("Qual sua idade?");
		idade = leia.nextInt();
		
		System.out.println("é sua primeira vez sendo doador: true ou false");
		decisao = leia.nextBoolean();
		
		if(idade>=18 && idade<=59) {
			System.out.printf(nome + " está apta para doar sangue!");
		}
		else if(idade>=60 && decisao == true) {
			System.out.printf(nome + " não está apta para doar sangue!");
		}
		else if(idade>=60 && decisao == false) {
			System.out.printf(nome + " está apta para doar sangue!");
		}
		else {
			System.out.printf(nome + " não está apta para doar sangue!");
		}
		
	}

}
