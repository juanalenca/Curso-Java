package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {


		Predicate<Integer> isPar = numero -> numero % 2 == 0;
		Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;
		
		
		//Operações lógicas com as funções or e and
		System.out.println(isPar.and(isTresDigitos).test(123));
		System.out.println(isPar.or(isTresDigitos).test(123));
		
		

	}

}