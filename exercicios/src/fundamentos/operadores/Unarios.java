package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {


		int a = 1;
		int b = 2;
		
		
		//Forma pós fixada
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		//Forma pré fixada
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		
		System.out.println(a);
		System.out.println(b);
		
		/*O resultado dá true porque o pré incremento feito na variavel a
		tem um precedência maior na comparação do que o pós decremento na variavel b,
		logo, o valor de b só será decrementado após ser feito a comparação e como 
		a variavel a tem um pré incremento, isso faz com ela já tenha sido incrementada 
		antes da comparação, fazendo o valor da operação ser true*/
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
		

	}

}
