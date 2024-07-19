package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		BinaryOperator<Integer> soma = 
				(acumulador, valorAtual) -> acumulador + valorAtual;
			
				
		/*
		Tanto o ForEach quanto o reduce, são métodos finais, 
	    não pode ser modificados
	    */
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		
		/*
		Mudando o valor do acumulador inicial caso queira 
		utilizar o paralleStream, ele vai fazer a soma varias 
		vezes, e o valor será diferente
		*/
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		
		
		//O resultado foi um Optional<Integer>
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
				
		
	}

}
