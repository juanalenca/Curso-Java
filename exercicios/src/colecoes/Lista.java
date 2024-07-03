package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		//Lista é uma estrutura ordenada e indexada
		List<Usuario> Lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Juan");
		
		Lista.add(u1);
		Lista.add(new Usuario("Amaro"));
		Lista.add(new Usuario("Marta"));
		Lista.add(new Usuario("Victoria"));
		Lista.add(new Usuario("Clara"));
		
		System.out.println(Lista.get(3)); // acessar pelo íncdice
		
		System.out.println("Removido >>>> "+Lista.remove(1));
		System.out.println(Lista.remove(new Usuario("Victoria")));
		
		System.out.println("Tem? "+Lista.contains(new Usuario("Marta")));
		
		for(Usuario u: Lista) {
			System.out.println(u.nome);
		}
		
	}

}