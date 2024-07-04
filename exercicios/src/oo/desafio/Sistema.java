package oo.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("PC", 4000), 2);

		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Monitor", 1500, 2);
		compra2.adicionarItem(new Produto("Teclado", 456.32), 1);
		

		Cliente cliente = new Cliente("Fulana Ciclana virjana");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		
	}

}
