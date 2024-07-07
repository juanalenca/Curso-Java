package oo.polimorfismo;

/*
Uma classe abstrata não pode ser instanciada
e pode ter tanto métodos abstratos quanto métodos
completos
*/
public abstract class Comida {

	private double peso;

	
	public Comida(double peso) {
		setPeso(peso);
	}

	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}

}
