package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Colecaoset {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		
		System.out.println(frutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta.hashCode());
		}
		frutas.remove(frutas);

		System.out.println(frutas);
		
		System.out.println("Afruta Amora esta presente no set? " + frutas.contains(frutas));
		System.out.println("o set esta vazio? " + frutas.isEmpty());
		
		Iterator<String> itFrutas = frutas.iterator();//navegado entre as collection
		
		//objeto itfrutas
		//o metodo hasnext -> tem o proximo elemento? e para mostrar o proximo é com next (só vai para frente)
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
		ArrayList<String> frutasList = new ArrayList<String>();
		
		
		frutasList.addAll(frutas); //coloca todos os elementos da colecao set o frutas no array frutalist que é o array list
		
		//ordenação dos dados em crescente
		//null nao quer ordenada em ordem em decrescente
		
		frutasList.sort(null);
		System.out.println(frutasList); //exibi o array list
		frutasList.sort(Comparator.reverseOrder());//ordenar descrescente
		System.out.println(frutasList); //exibi o array list
	}

}
