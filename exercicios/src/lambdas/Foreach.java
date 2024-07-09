package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {


		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma Tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
		
		System.out.println("\nLambda #01...");
		
		//Para cada elemento na lista foreach, execute essa função lambda
		aprovados.forEach( (nome) -> { System.out.println(nome + "!!!"); } );
		
		
		
		System.out.println("\nMethod Reference #01...");
		
		/*
		Os "::" siguinifica que estamos passando uma referência de um método para essa função.
		"Para cada elemento de aprovados, imprima na saida do sistema". Ou seja, cada elemento 
		percorrido na lista de aprovados foi passsado automaticamente como parâmetro para o println
		*/
		aprovados.forEach(System.out::println);
		
		
		
		System.out.println("\nLambda #02...");
		aprovados.forEach( (nome) -> meuImprimir(nome));
		
		
		
		System.out.println("\nMethod Reference #02...");
		//Passando uma referencia para uma função já criada
		aprovados.forEach(Foreach::meuImprimir);

		
	}
	
	static void  meuImprimir(String nome) {
		System.out.println("Hello, World! My name is "+nome);
	}

}