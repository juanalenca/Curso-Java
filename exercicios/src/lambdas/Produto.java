package lambdas;

//A classe mãe de todas as classes é o Object, todas a extendem
public class Produto extends Object{
	
	
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}


	@Override
	public String toString() {
		double precofinal = preco * (1 - desconto);
		return "[nome= " + nome + ", preco= " + preco + ", valor final= " + precofinal + "]";
	}

	
}
