package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		
		Produto p1 = new Produto("garrafa", 4356.89);
		
		
		Produto p2 = new Produto();
		p2.nome = "teclado";
		p2.preco = 12.56;
		
		
		Produto.desconto = 0.50;
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaPreco = (precoFinal1 + precoFinal2)/2;
		
		
		System.out.printf("O preço do produto %s (R$%.2f) com desconto é R$%.2f\n", p1.nome, p1.preco, precoFinal1);
		System.out.printf("O preço do produto %s (R$%.2f) com desconto é R$%.2f\n", p2.nome, p2.preco, precoFinal2);
		System.out.printf("A média de preço foi de %.2f.\n", mediaPreco);
		
		

	}

}