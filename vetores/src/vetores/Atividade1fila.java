package vetores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1fila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, numero;

		Queue<String> filaCliente = new LinkedList<String>();
		
		menu();
		System.out.println("Digite uma opção:");
		numero = leia.nextLine();
		
		while(numero.equalsIgnoreCase("1")|| numero.equalsIgnoreCase("2") || numero.equalsIgnoreCase("3") || numero.equalsIgnoreCase("0")) {
			
			if(numero.equalsIgnoreCase("1")) {
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				filaCliente.add(nome);
				System.out.println("Fila");
				System.out.println(filaCliente);
				System.out.println("Cliente Adicionado! ");
			}
			else if(numero.equalsIgnoreCase("2")) {
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(filaCliente);
			}
			else if (numero.equalsIgnoreCase("3")) {
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
			numero = leia.nextLine();

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
