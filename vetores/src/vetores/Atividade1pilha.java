package vetores;

import java.util.Scanner;
import java.util.Stack;

public class Atividade1pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String numero,nome;
		Stack<String> pilha = new Stack<String>();
		
		menu();
		System.out.println("Digite uma opção:");
		numero = leia.nextLine();
		
		while(numero.equals("1") || numero.equals("2") || numero.equals("3")|| numero.equals("0") ) {
			if(numero.equals("1")) {
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				pilha.add(nome);
				System.out.println("Lista");
				System.out.println(pilha);
				System.out.println("Livro Adicionado! ");
			}
			else if(numero.equals("2")) {
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(pilha);
			}
			else if (numero.equals("3")) {
				if(pilha.isEmpty() == true) {
					System.out.println("A Pilha esta vazia! ");
				}else {				
					System.out.println("Pilha: ");
					System.out.println(pilha);
					pilha.pop();
					System.out.println("Pilha: ");
					System.out.println(pilha);
					System.out.println("Um Livro foi retirado da pilha! ");
				}
			}
			else{
				System.out.println("Programa Finalizado!");
			}
			
			menu();
			System.out.println("Digite uma opção:");
			numero = leia.nextLine();
		}
	}
	
	public static void menu() {
		System.out.println("********************************");
		System.out.println("	1 - Adicionar Livro na pilha");
		System.out.println("	2 - Listar todos os Livro	");
		System.out.println("	3 - Retirar Livro na pilha  ");
		System.out.println("	0 - Sair");
		System.out.println("********************************");
	}

}
