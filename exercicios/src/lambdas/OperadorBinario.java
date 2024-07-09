package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		/*
		 O operador binario recebe dois parâmetros do mesmo tipo e 
		 retorna apenas um valor do mesmo tipo. E como são dois parâmetros
		 colocamos entre (), e você pode expecificar os tipos dos parâmetros
		 que por padrão são o mesmo do tipo declarado nas <>
		 */
		BinaryOperator<Double> media = 
				(Double n1, Double n2) -> (n1 + n2) / 2;
				
		System.out.println(media.apply(9.8, 5.7));
		
		
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2; 
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(9.7, 6.1));
		
		
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));
		
		
	}

}