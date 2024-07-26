package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1,  "Juan");
		resultadoConcurso.adicionar(2,  "Allysson");
		resultadoConcurso.adicionar(3,  "Roberto");
		resultadoConcurso.adicionar(4,  "Amaro");
		resultadoConcurso.adicionar(2,  "Victoria");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
		
		
	}

}
