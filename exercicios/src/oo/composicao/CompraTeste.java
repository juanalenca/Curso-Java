package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.cliente = "Fulano";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 3.45));
		compra1.adicionarItem(new Item("Borracha", 45, 16.45));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		//Apenas um exemplo da relação bidirecinal
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O vlaor total é: " + total);

	}

}