package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		//pegando caracteres especificos de uma string atraves desse método
		System.out.println("Hello people".charAt(6));
		
		String s = "Good afternoon";
		System.out.println(s + "!!!");
		//or
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Good")); //true
		System.out.println(s.startsWith("good")); //false
		System.out.println(s.toLowerCase().startsWith("good")); //true		
		System.out.println(s.endsWith("afternoon")); //true		
		System.out.println(s.length()); //n° de caracteres
		System.out.println(s.equals("GOOD AFTERNOON")); //false
		System.out.println(s.equalsIgnoreCase("GOOD AFTERNOON")); //true, pois ignora se é maiúsculo ou minúsculo
		System.out.println(s.contains("after")); //identifica se tem o determinado conjunto de caracteres na string
		System.out.println(s.indexOf("after")); //quando começa a string tal
		System.out.println(s.substring(5, 10)); //o que tem na determinado intervalo de indices especificados
		
		
		
		
		//também podemos utilizar os metodos da String utilizando o tipo var, que identifica que o valor é String
		var nome = "Juan";
		nome.toUpperCase();
		var sobrenome = "Alencar de Barros";
		var idade = 19;
		var salario = 7663.693;
		
		
		//%s = strinfs, %d = int, %f = flutuante
		System.out.printf("\nVocê é %s %s, tem %d anos e um salário de R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nVocê é %s %s, tem %s anos e um salário de R$%.2f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		
	}

}
