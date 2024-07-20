package streams;

import java.util.Arrays;
import java.util.List;

public class Others {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Juan", 9.6);
		Aluno a3 = new Aluno("Victoria", 8.7);
		Aluno a4 = new Aluno("Fulano", 4.9);
		Aluno a5 = new Aluno("Julia", 7.1);
		Aluno a6 = new Aluno("Laura", 9.6);
		Aluno a7 = new Aluno("Victoria", 8.7);
		Aluno a8 = new Aluno("Fulano", 4.9);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip (pular) / Limit");
		alunos.stream()
			.distinct() 
			.limit(2) //apenas dos elementos
			.skip(2) //de dois em dois
			.forEach(System.out::println);
		
		System.out.println("\nTake / While");
		alunos.stream()
		.distinct()  
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
		
		
		

	}

}
