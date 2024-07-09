package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		//Interface funcional que receb um parãmetro e não retorna nada
		Consumer<Produto> imprimir = 
				produto -> System.out.println(produto.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		//Função que só recebe um parâmetro e não retorna também
		imprimir.accept(p1);
		
		
		Produto p2 = new Produto("Carro", 12.34, 0.09);
		Produto p3 = new Produto("Macbook", 12000.34, 0.09);
		Produto p4 = new Produto("Iphone", 5634, 0.09);
		Produto p5 = new Produto("Starlink", 1287, 0.09);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(produto -> System.out.println(produto.preco));
		produtos.forEach(System.out::println);
		
	}

}
