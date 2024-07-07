package oo.abstrato;

public abstract class Mamifero extends Animal {

	public abstract String mamar(); // ( ͡° ͜ʖ ͡°)
	
	//métodos constantes não podem ser sovbrescritos por subclasses
	@Override
	public final String mover() {
		return "Saindo do lugar";
	}
	
}
