package oo.heranca.desafios;
public class TesteCarro {
	public static void main(String[] args) {
		
		Carro c1 = new Civic(0);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		
		System.out.println();
		
		
		Ferrari c2 = new Ferrari(400);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
	}
	
}
