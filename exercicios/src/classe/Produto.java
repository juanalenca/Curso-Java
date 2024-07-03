package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	
	// Construtor padrão
	Produto() {
	}

	// Construtor explicito
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDeNatal) {
		return preco * (1 - desconto + descontoDeNatal);
	}

}