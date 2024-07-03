package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	//silencia as adivertências do código, pois o conjunto está heterogênio, o que não é o ideal
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {


		HashSet conjunto = new HashSet(); 
		
		//como as collections não aceitam tipos primitivos, eles convertem eles para classes
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); 
		conjunto.add("Teste"); 
		conjunto.add(6); 
		conjunto.add('j');
		
		System.out.println("O tamanho do HashSet é " + conjunto.size());
		
		conjunto.add("Teste"); 
		conjunto.add('J'); 
		
		//Como o Set não aceita repetição, ele ainda continuará com os mesmos valores
		//A não ser que seja a mesma palavra minúsculo ou maiúculo
		System.out.println("O tamanho do HashSet é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('j'));

		
		System.out.println("O tamanho do HashSet é " + conjunto.size());
		
		System.out.println(conjunto.contains('j'));
		System.out.println(conjunto.contains(6));
		System.out.println(conjunto.contains(true));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(6);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//unificando nums a conjunto (união entre dois conjuntos)
		//conjunto.addAll(nums);
		
		//retem apenas os valores em comum
		conjunto.retainAll(nums);
		
		//limpa o conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}