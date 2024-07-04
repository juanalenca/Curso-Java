package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	
	
	//lista de cursos a partir da clsse Curso
	//uma lista constante não pode apontar/mudar para outros endereços de memoria
	//porém, seus valores, ainda pode ser modificados 
	final List<Curso> cursos = new ArrayList<>();
	
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}	
	
	
	Curso obterCursoPorNome(String nome) {
		
		for(Curso curso: this.cursos) {
			//caso o nome curso seja igual ao nome que foi passado como parâmetro nesse método
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	
	public String toString() {
		return "Aluno: " + nome;
	}
	
}