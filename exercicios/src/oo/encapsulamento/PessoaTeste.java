package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Juan", "Alencar de Barros", -19);
		p1.setIdade(230); // Alterando o valor da variável
		
		
		System.out.println(p1.getNome()); // lendo o valor da variável
		System.out.println(p1); // toString 
		System.out.println(p1.getnomeCompleto()); 
		
	}

}
