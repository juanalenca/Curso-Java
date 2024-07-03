package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {


		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Prícipe");
		livros.push("Game of Thrones");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		
		System.out.println();
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println();
		
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.pop());
		//System.out.println(livros.remove());
		
		//livros.size();
	    //livros.clear(); -> lipa pilha
		//livros.isEmpty(); -> se a pilha está ou não vazia
		//livros.contains(...); -> se está ou não contido
		
		

		

	}

}