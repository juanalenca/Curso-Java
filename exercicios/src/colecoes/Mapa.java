package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {


		Map<Integer, String> usuarios = new HashMap<>();
		
		//(key, value)
		usuarios.put(1, "Juan");
		usuarios.put(6, "Amaro");
		usuarios.put(3, "Marta");
		usuarios.put(4, "Victoria");

		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		
		System.out.println(usuarios.containsKey(6));
		System.out.println(usuarios.containsValue("Juan"));
		
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		//caso ambos os dados sejam corretos, ele remove
		System.out.println(usuarios.remove(4, "Vic"));
		
		
		
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey()+" ==> ");
			System.out.println(registro.getValue());
		}
		
		
		
	}

}
