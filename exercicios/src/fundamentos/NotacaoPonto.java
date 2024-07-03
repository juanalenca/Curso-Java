package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		/*
		 a notação ponto permite aplicar uma determinada 
		 logica a um determinado dado, que neste exemplo 
		 é um dado de uma variável:
		 */
		
		//Obs: Tipos primitivos não têm o operador "."
		//Exemplo 1
		String nome = "Juan".toUpperCase();
		
		System.out.println(nome);
		
		
		//Exemplo 2
		String mensagem = "Good morning";
		
		//método que converte a string para a letras maiúculas, mas isso é feito apenas nessa linha
		mensagem.toUpperCase();
		
		//neste caso, a variável será realmente modificada pelo método
		mensagem = mensagem.toLowerCase();
		
		//método que substitui o valor da variável
		mensagem = mensagem.replace("morning", "day");
		
		//método que conctena 
		mensagem = mensagem.concat("!!!");
		
		System.out.println(mensagem);
		
		
		/* Exemplo 3
		essa sequencia de aplicação de métodos em uma mesma string só funciona 
		por serem métodos que modificam os caracteres caso for um método que 
		mostre outro tipo de dado com base na string, não será possível aplicar 
		todos os métodos, como por exemplo o uso do .length(), quem mostra um dado numerico
		*/
		String x = "Hello, X".replace("X", "Juan").toUpperCase().concat(" :)");
		System.out.println(x);
		
	}

}
