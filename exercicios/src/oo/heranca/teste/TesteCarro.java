package oo.heranca.teste;

import oo.heranca.desafios.Carro;
import oo.heranca.desafios.Civic;
import oo.heranca.desafios.Ferrari;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro c1 = new Civic(0);
		
		c1.acelerar();
		System.out.println("Civic - "+c1);
		
		c1.acelerar();
		System.out.println("Civic - "+c1);
		
		c1.acelerar();
		System.out.println("Civic - "+c1);
		
		
		System.out.println();
		
		
		//Carro c2 = new Ferrari(400);
		//como dentro da classe Carro não existe o método da interface:
		Ferrari c2 = new Ferrari(400);
		
		c2.ligarTurbo();
		
		c2.ligarAr();
		c2.desligarAr();
		
		c2.acelerar();
		c2.frear();
		System.out.println("Ferrari - "+c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println("Ferrari - "+c2);
		
		c2.acelerar();
		System.out.println("Ferrari - "+c2);
		
		System.out.println(c2.velocidadeDoAr());
		
	}
	
}
