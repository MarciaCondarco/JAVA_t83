package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Duna");
		pilha.push("maus");
		pilha.push("crime e castigo");
		pilha.push("O Navio de Teseu");
		
		System.out.println(pilha);		
		pilha.pop();//pop só remove e não retorna
		System.out.println(pilha);
		System.out.println("O livro guia do mochileiro da galaxia esta na pilha" + pilha.contains("crime e castigo"));

	}

}
