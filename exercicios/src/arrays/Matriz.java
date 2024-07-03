package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe a quantidade de alunos: ");
		int qtdAlunos = scan.nextInt();
		
		System.out.println("informe as notas por aluno: ");
		int qtdNotas = scan.nextInt();
		
		
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
	
		
		double soma = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			//percorre os alunos (externo)
			
			for (int n = 0; n < notasTurma[a].length; n++) {
				
				//percorre as notas (interno) 
				System.out.printf("Informe a %d° nota do %d° aluno: ", n+1, a+1);
				notasTurma[a][n] = scan.nextDouble();
				soma += notasTurma[a][n];
		
			}
		}
		
		
		double media = soma / (qtdAlunos * qtdNotas);
		System.out.printf("A média da turma é %.2f.\n", media);
		
		
		for(double[] notasDoAluno: notasTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		scan.close();
		
	}

}