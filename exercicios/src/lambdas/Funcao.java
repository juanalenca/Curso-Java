package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		//A interface funcional Function recebe um parâmetro de entrada de um tipo
		//e pode retorna um valor de outro tipo
		//Sintaxe TipoFunction<tipoParams> nomeFunction = parametroMétodo -> bloco de comandos
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOuImpar.apply(33));
				
		
		Function<String, String> resultado = valor -> "O resultado é " + valor;
		
		
		Function<String, String> empolgado = valor -> valor + "!!!";

		
		Function<String, String> duvida = valor -> valor + "???";
		
		
		/*
		Aqui, através do andThen, interligamos três funções, onde uma retorna um valor do 
		mesmo tipo que a outra recebe. Neste caso, um valor do tipo String, caso o contrário, 
		não seria possível. Assim, o parâmetro que passsamos dentro do apply vai ser passado 
		para primeira função (parOuImpar) dasta variável (resultadoFinal), logo o parâmetro 
		Integer é tratado dentro de parOuImpar, saiu um valor do tipo String, que vai ser tratada 
		como parãmetro na função reusltado, e o resultado String dessa função vai ser passsada na 
		ultima função, empolgada, como parâmetro; e o resultado dessa ultima função, que é do tipo 
		String, vai ser o valor recebido pela variável resultadoFinal.
		*/
		String resultadoFinal1 = parOuImpar
				.andThen(resultado)
				.andThen(empolgado)
				.apply(12);
		
		System.out.println(resultadoFinal1);
		
		
		
		String resultadoFinal2 = parOuImpar
		.andThen(resultado)
		.andThen(duvida)
		.apply(11);
		
		System.out.println(resultadoFinal2);
		
	}

}