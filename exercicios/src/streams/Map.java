package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {


		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Ferrari ", "Audi ");
		
		/*
		build oparation -> .stram(), inter operation -> .map() or others
		Como o map recebe uam function e retorna uma stream, ele está 
		iterandotodos os valores do array list para letra maiuscula
		*/
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + "!!! ";
		
		
		System.out.println("\n\nUsando composição:");
		
	
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		
		
		

	}

}
