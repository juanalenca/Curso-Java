package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		//final (constante) é a palavra chave que indica que o valor não pode ser mudado
		final double PI	= 3.14159;
		double raio = 3.4;
		double area = PI*raio*raio;
		
		System.out.println("A área da circunferência é " + area + "m2.");
		
		
		raio = 10;
		area = PI*raio*raio;
		
		System.out.println("A área da segunda circunferência é " + area + "m2.");
		
		
	}

}
