package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {


		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		
		System.out.println(c1.estaLigado());
		
		
		
		/*acessando o método .giros() a partir do 
		 *instanciamento da classe Motor feito 
		 *dentro da classe Carro*/
		System.out.println(c1.motor.giros());
		
		c1.acelarar();
		c1.acelarar();
		c1.acelarar();
		c1.acelarar();

		System.out.println(c1.motor.giros());
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		
		
		//É necessário o encapsulamento para essa situações
		//c1.motor.fatoInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		//relação bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());

	}

}
