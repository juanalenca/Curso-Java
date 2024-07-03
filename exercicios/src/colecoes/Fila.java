package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		// Ambos adiconam elementos na fila, mas a diferença ocorre quando a fila está cheia:
		// .add() lançará uma exceção caso a fila esteja cheia. 
		fila.add("Ana");
		// .offer() retorna falso caso a fila esteja cheia.
		fila.offer("Juan");
		fila.add("Fulano");
		fila.offer("Ciclano");
		fila.add("Beutrano");
		fila.offer("Folano");
		
		
		
		/*
		O peek e o elment vão obter o próximo elemnto da fila (sem remover).
		O que diferencia os dois é quando a fila está vazia:
		*/
		//retorna nulo caso não tenham elementos na fila
		System.out.println(fila.peek()); 
		System.out.println(fila.peek());
		//retorna uma exceção caso não tenham elementos na fila
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		
		//O remove e o poll obtem o próximo elemento da lista e o removem
		//retorna null se não tiver mais dados
		System.out.println(fila.poll());
		//já o remove lança uma exceção se não tiver dados na lista
		System.out.println(fila.remove());
		
		
		
		//fila.size();
	    //fila.clear(); -> lipa fila
		//fila.isEmpty(); -> se a fila está ou não vazia
		//fila.contains(...); -> se está ou não contido

		
	}

}