package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa);
		
		/*Como você extendeu a classe Ana, 
		 * você herda os atributos de Ana,
		 * sem precisar instanciar a Ana*/
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
	
}
