package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
	
	private Validar() {}
	
	public static void aluno(Aluno aluno) {
		 
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		//se o nome está null ou se o nome, sem os espaços, está vazio
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
		
	}

}
