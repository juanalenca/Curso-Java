package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.8;
		notasAlunoA[1] = 10;
		notasAlunoA[2] = 6.2;
		notasAlunoA[3] = 9.5;
		
				
		System.out.println(Arrays.toString(notasAlunoA));
	
	
		double totalA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
	
		System.out.println("Soma das notas A: "+ totalA);
		System.out.println("Média das notas A: "+ totalA / notasAlunoA.length);
		
		
		double notaArmazenada = 4.5;
		double[] notasAlunoB = {2.5, notaArmazenada, 8.9, 10};
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		
		System.out.println("\nSoma das notas B: "+ totalB);
		System.out.println("Média das notas B: "+ totalB / notasAlunoB.length);
	
	}

}
