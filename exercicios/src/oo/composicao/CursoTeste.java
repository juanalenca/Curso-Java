package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Juan");
		Aluno aluno2 = new Aluno("Victoria");
		Aluno aluno3 = new Aluno("Fulana");
		
		Curso cursoA = new Curso("COBOL - Programação Orientada a Loucura");
		Curso cursoB = new Curso("ASSEMBLY - Programação Orientada Alexa");
		Curso cursoC = new Curso("C - Programação Orientada a Microsoft");
		
		
		cursoA.adicionarAluno(aluno1);
		cursoA.adicionarAluno(aluno2);
		
		cursoB.adicionarAluno(aluno1);
		cursoB.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(cursoC);
		aluno2.adicionarCurso(cursoC);
		aluno3.adicionarCurso(cursoC);
		
		
		for(Aluno aluno: cursoC.alunos) {
			System.out.printf("Meu nome é %s e estou matriculado no curso %s.\n", aluno.nome, cursoC.nome);
			System.out.println();
		}
		
		
		//Todos os alunos do curso
		System.out.println(aluno1.cursos.get(0).alunos);
		
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("COBOL - Programação Orientada a Loucura");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}

	}

}