package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		//atribuindo a referencia de método a uma variável
		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::println;
		
		
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
	
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		
		langs.forEach(print);
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		//aqui ele inclui o primeiro indice (1) até o anterior ao ultimo (4)
		Arrays.stream(maisLangs, 1, 4).forEach(print);;
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "kobol\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		/*
		gera infinitamente: 
		Stream.generate(() -> "a").forEach(print);;
		Stream.iterate(0, n -> n + 1).forEach(println);
		*/
		
		
		
	}

}
