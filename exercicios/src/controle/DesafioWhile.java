package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		
		double nota = 0;
		double total = 0;
		int contador = 0;
		
		System.out.println("Digite a nota dos alunos (-1 para encerrar): ");
		do {
			
			System.out.println("Nota: ");
			nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				contador++;
			}else if(nota == -1) {
				break;
			}else{
				break;
			}
			
			
		} while(nota >= 0);
		
		
		if(total > 0) {
			double media = total/contador;
			System.out.printf("A soma de todas as notas é %.2f e a média total dos alunos foi %.2f", total, media);
		}else {
			System.out.println("Nõa foram digitados valores o suficiente para realizar a média.");
		}
		
		
		scan.close();
		

	}

}
