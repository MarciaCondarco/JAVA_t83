package repeticao;

import java.util.Scanner;

public class Exercicio4repe {

	public static void main(String[] args) {
		
		Scanner leia =new Scanner(System.in);
		
		int idade, identidade,pessoa;
		
		String continua = "S";
		
		int i = 0;
		int f = 0;
		int g = 0;
		int m = 0;
		int n = 0;
		int j = 0; 
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0; //contador para maiores de 40 anos
		int p = 0; //contador para menores de 30 anos
		int z = 0; //contador de quantidade que responderam
		int quantcontinua =0 ;
		int resulidade = 0;
		
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1 - Mulher Cis"  );
			System.out.println("2 - Homem Cis   ");
			System.out.println("3 - Não Binário" );
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans" );
			System.out.println("6 - Outros      ");
			
			System.out.println("Digite o numero da identidade de genero: ");
			identidade = leia.nextInt();
			
			if(identidade == 1) {
				i++;
			}
			else if(identidade ==2) {
				f++;
			}
			else if(identidade == 3) {
				g++;
			}
			else if(identidade == 4) {
				m++;
			}
			else if(identidade == 5) {
				n++;
			}
			else if(identidade == 6) {
				j++;
			}
			else {
				System.out.println("opção invalida, seleciona uma opção fornecida");
			}
			
			System.out.println("1 = Backend");
			System.out.println("2 = Frontend");
			System.out.println("3 = Mobile");
			System.out.println("4 = Fullstack");
			
			System.out.println("Digite a o numero da pessoa desenvolvedora: ");
			pessoa = leia.nextInt();
			
			if(pessoa == 1) {
				a++;
			}
			else if(pessoa == 2) {
				b++;
			}
			else if(pessoa == 3) {
				c++;
			}
			else if(pessoa == 4) {
				d++;
			}
			else{
				System.out.println("opção invalida, seleciona uma opção fornecida");
			}
			
			if(idade>=40) {
				e++;
			}
			else if(idade <= 30) {
				p++;
			}
			
			System.out.println("Deseja continuar com outro colaborador? (S/N)");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
			resulidade = resulidade + idade;
			
			quantcontinua++;
			
		}
		
		
		System.out.printf("O número de pessoas desenvolvedoras Backend: %d", a);
		System.out.printf("O número de Mulheres Cis e Trans desenvolvedoras Frontend: ", (i + m + b));
		System.out.printf("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: ", (f+n+e));
		System.out.printf("O número de Não Binários desenvolvedores FullStack menores de 30 anos: ", (g + d + p));
		System.out.printf("O número total de pessoas que responderam à pesquisa: ", quantcontinua);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: ", (resulidade/quantcontinua));
		
		leia.close();
			
		}

	}


