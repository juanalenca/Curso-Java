package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Juan", 9.6);
		Aluno a3 = new Aluno("Victoria", 8.7);
		Aluno a4 = new Aluno("Fulano", 4.9);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		
		Comparator<Aluno> BestGrade = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno> WorstGrade = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(BestGrade).get());
		System.out.println(alunos.stream().min(WorstGrade).get());
		
		System.out.println(alunos.stream().min(BestGrade).get());
		System.out.println(alunos.stream().max(WorstGrade).get());
		
		
		
		
		

	}

}
