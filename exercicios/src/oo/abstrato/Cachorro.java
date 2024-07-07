package oo.abstrato;

public class Cachorro extends Mamifero {
	
	/*
	É obrigado declarar, pois não foi definido na classe Mamifero.
	Caso seja, não precisa, e se for um método final, não é possível
	declarar:
	
	@Override
	public String mover() {
		return "Usando as patas";
	}
	*/
	
	@Override
	public String mamar() {
		return "Usando leite";
	}

}
