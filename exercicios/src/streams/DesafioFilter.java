package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
		Produto p2 = new Produto("PS5", 3199, 0.23, 0);
		Produto p3 = new Produto("Xbox", 3499, 0.45, 0);
		Produto p4 = new Produto("Dual Sence", 319, 0.67, 0);
		Produto p5 = new Produto("SSD", 237.89, 0.10, 0);
		Produto p6 = new Produto("Monitor", 1999.89, 0.15, 0);
		Produto p7 = new Produto("RX 4070", 3234.56, 0.40, 0);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		
		Predicate<Produto> superDesconto = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.frete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		
		
		Function<Produto, String> chamadaPromocional = 
				p -> "Aproveite! " + p.nome + " por " + p.preco + "!!!";
		
		
		produtos.stream()
		.filter(superDesconto)
		.filter(freteGratis)
		.filter(precoRelevante)
		.map(chamadaPromocional)
		.forEach(System.out::println);
	}

}
