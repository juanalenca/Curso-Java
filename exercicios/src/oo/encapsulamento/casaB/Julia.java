package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcessos() {
		// System.out.println(esposa.segredo);
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar); -> não herda, pois não extendeu a Ana
		System.out.println(sogra.todosSabem);
	}

}
