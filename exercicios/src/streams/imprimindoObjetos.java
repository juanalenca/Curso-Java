package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {

	public static void main(String[] args) {


		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		
		System.out.println("Usanso o for");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		
		
		System.out.println("\nUsanso o foreach");
		for(String nome: aprovados) {
			System.out.println(nome);
		}

		
		
		System.out.println("\nUsanso Iterator");
		
		Iterator<String> iterador = aprovados.iterator();
		
		//método hasNext (tem próximo)
		while(iterador.hasNext()) {
			//se tiver, ele passa para o próximo elemento da lista
			System.out.println(iterador.next());
		}
		
	
		
		System.out.println("\nUsanso Stream");
		
		//Stream é uma sequencia de dados de qualquer tipo que vocÊ definir no <>
		Stream<String> stream = aprovados.stream();
		
		stream.forEach(System.out::println); //Laço interno!
		
		

	}

}
