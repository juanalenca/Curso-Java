package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Quantas notas você deseja disponibilizar? ");
		int tamanho = scan.nextInt();
		
		
		double[] notas = new double[tamanho];
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d° nota: \n", i+1);
			double nota = scan.nextDouble();
			notas[i] = nota;
		}
		
		
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		double media = soma / tamanho;
		
		
		System.out.printf("A soma das notas é %.2f, totalizando uma média de %.2f", soma, media);
		
		
		scan.close();
		
	}

}