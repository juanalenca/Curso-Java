package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {


		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Juan", 9.6);
		Aluno a3 = new Aluno("Victoria", 8.7);
		Aluno a4 = new Aluno("Fulano", 8.9);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		//Match (função terminadora) -> corresponde, interligado
		//Nesse casso, ele vai analisar se todos os alunos que correspondem a "aprovado"
		System.out.println(alunos.stream().allMatch(aprovado));
		//Aqui é o anyMatch (pelo menos um correspondente)
		System.out.println(alunos.stream().anyMatch(aprovado));
		//noneMatch (nenhum deu match)
		System.out.println(alunos.stream().noneMatch(reprovado));
		
		
		

	}

}
