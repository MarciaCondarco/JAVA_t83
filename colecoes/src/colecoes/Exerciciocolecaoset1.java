package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerciciocolecaoset1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero;
		
		Set<Integer> setNumero = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			
				System.out.println("Digite um valor: ");
				numero = leia.nextInt();
				setNumero.add(numero);
		}
		
		System.out.printf("Listar os dados do set: %n");
		
		Iterator<Integer> itNumero = setNumero.iterator();
		
		while(itNumero.hasNext()) {
			System.out.println(itNumero.next());
		}
		leia.close();
	}

}
