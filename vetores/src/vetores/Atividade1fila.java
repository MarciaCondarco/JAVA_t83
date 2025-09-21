package vetores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1fila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int numero;

		Queue<String> filaCliente = new LinkedList<String>();
		
		menu();
		System.out.println("Digite uma opção:");
		numero = leia.nextInt();
		
		while(numero == 1 || numero == 2 || numero == 3 || numero == 0) {
			
			if(numero == 1) {
				System.out.println("Digite o nome: ");
				leia.skip("\\R");
				nome = leia.nextLine();
				filaCliente.add(nome);
				System.out.println("Cliente Adicionado! ");
			}
			else if(numero == 2) {
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(filaCliente);
			}
			else if (numero == 3) {
				if(filaCliente.isEmpty() == true) {
					System.out.println("A Fila esta vazia! ");
				}else {				
					System.out.println("Fila: ");
					System.out.println(filaCliente);
					filaCliente.remove();
					System.out.println("Fila: ");
					System.out.println(filaCliente);
				}
			}
			else{
				System.out.println("Programa Finalizado!");
			}
			
			menu();
			System.out.println("Digite uma opção:");
			numero = leia.nextInt();

		}
		
		System.out.println("opção invalida");
		
		leia.close();

}
	public static void menu() {
		System.out.println("*********************************");
		System.out.println("	1 - Adicionar Cliente na Fila");
		System.out.println("	2 - Listar todos os Clientes ");
		System.out.println("	3 - Retirar Clientes da Fila ");
		System.out.println("	0 - Sair");
		System.out.println("\n*********************************");
	}

}
