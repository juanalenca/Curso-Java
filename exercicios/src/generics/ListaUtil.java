package generics;

import java.util.List;

public class ListaUtil {
	
	//<?> == aceita qualquer coisa
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	//o tipo da lista do instanciamento é recebido pelo tipo generico T
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}

}
