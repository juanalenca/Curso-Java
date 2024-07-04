package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Juan"));
		usuarios.add(new Usuario("Marta"));
		usuarios.add(new Usuario("amaro"));

		
		boolean resultado = usuarios.contains(new Usuario("Juan"));
		System.out.println(resultado);
		
		
	}

}
