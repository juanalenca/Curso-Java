package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		//Predicate rece um determinado tipo de parâmetro e retorna true ou false
		//Por convenção, se utiliza o "is" na nomenclatura
		Predicate<Produto> isExpensive = 
				produto -> (produto.preco * (1 - produto.desconto)) >= 1000;
		
				
		Produto p1 = new Produto("PC", 3456.89, 0.85);
		
		System.out.println(isExpensive.test(p1));
		
	}

}
