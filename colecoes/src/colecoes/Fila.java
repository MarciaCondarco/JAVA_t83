package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//CTRL + SHIFT + O -> JÁ IMPORTA OS OBJETOS
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Leticia");
		fila.add("Cintia");
		fila.add("Raissa");
		
		System.out.println(fila);
		
		//retirar um elemento da fila
		fila.remove();
		
		System.out.println(fila);
		
		fila.add("Marcia");
		fila.add("Marceline");
		
		System.out.println(fila);
		System.out.println("o tamanho da fila é: " + fila.size());

		System.out.println("A primeira da fila da fila é: " + fila.peek());
		
		
		//var é uma referencia para o tipo de dados
		for(var pessoa : fila) {
			System.out.println(pessoa);
		}
		
	}

}
