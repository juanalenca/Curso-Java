package oo.heranca.desafios;
public class Ferrari extends Carro {
	
	Ferrari() {
		super(315);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}

	
//	@Override
//	void acelerar() {
//		super.acelerar();
//	}

}
