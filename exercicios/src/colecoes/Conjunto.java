package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto {

	public static void main(String[] args) {

		// <tipoDaLista>, assim ele receberá apenas esse tipo especificado
		// Do lado direito você pode colocar assim <> ou <tipoDaLista>
		// Set<String> lista = new HashSet<>();

		// or: para respeitar a ordem dos conjuntos inseridos
		SortedSet<String> lista = new TreeSet<>();

		lista.add("Juan");
		lista.add("Amaro");
		lista.add("Marta");
		lista.add("Victoria");

		for (String candidato : lista) {
			System.out.println(candidato);
		}

		
		
		
		Set<Integer> nums = new HashSet<>();

		nums.add(6);
		nums.add(12);
		nums.add(24);
		nums.add(30);
		
		for(int n: nums) {
			System.out.println(n);
		}

	}

}