package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		//Não recebe nenhum parãmetro e retorna alguma coisa
		//O retorna aqui será uma lista do tipo String
		//Como não tem parãmetro, colocamos um () vazio
		Supplier< List<String> > umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(umaLista.get());

	}

}