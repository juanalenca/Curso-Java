package oo.composicao;

public class Carro {

	/*Aqui estamos tendo uma relação de um para um,
	 * já um carro só pode ter um motor e um motor só
	 * pode ter um carro, assim, é possível um classe
	 * ter uma outra classe como atributo: */
	final Motor motor; 
	
	Carro() {
		this.motor = new Motor(this);
	}
	
	
	void acelarar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}

	void freiar() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
