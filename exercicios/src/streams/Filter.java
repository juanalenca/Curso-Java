package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {


		Aluno a1 = new Aluno("Ana", 7.9, true);
		Aluno a2 = new Aluno("Juan", 6.6, true);
		Aluno a3 = new Aluno("Amaro", 9.9, true);
		Aluno a4 = new Aluno("Marta", 8.6, false);
		Aluno a5 = new Aluno("Victoria", 6.9, false);
		Aluno a6 = new Aluno("Sun", 10.0, false);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Predicate<Aluno> bomComportamento = a -> a.bomComportamento;
		
		Function<Aluno, String> saudacaoAprovado = 
				a -> "Parabéns, " + a.nome + "! Você foi aprovado(a)!!!";
		
		
		alunos.stream()
			.filter(aprovado)
			.filter(bomComportamento)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
		
		
	}

}
