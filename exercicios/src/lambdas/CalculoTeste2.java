package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		/*Obs: lambdas só funcionam com interfaces funcionais1
		 Aqui temos definição de uma função lambda, que 
		 é recebida por uma variável do tipo Calculo 
		 (que é uma interface). Assim, o resultado desta 
		 função é diretamente associado a variável. Basicamente 
		 estamos definindo a lógica da única função criada na 
		 interface "Calculo". Porém, é preciso que a função 
		 lambda tenha parâmetros e recebimento de valores 
		 exatamente iguais aos que foram definidos na criação 
		 da função dentro da interface, neste caso, a função 
		 "executer()" precisa ter dois parâmetros do tipo double
		 e retornar um valor double, e isso é feito de maneira 
		 implícita na declaração da lambda:
		*/
		Calculo operacao = (x, y) -> {
			return x + y;
		};
		
		//Recebe dois parâmetross do tipo double e precisa retornar um double,
		//como foi definido na sua criação.
		System.out.println(operacao.executar(2, 3));
		
		
		/*
		Outra forma de declarar: " operacao = (x, y) -> x * y; "
		Mas você não pode utilixar a palavra return, pois não tem {}.
		E você não pode escrever mais de uma sentença de código sem as {}.
		*/
		operacao = (x, y) -> {
			return x * y;
		};
		
		System.out.println(operacao.executar(2, 3));
		
		System.out.println(operacao.cool());
		System.out.println(Calculo.soCool());

	}

}