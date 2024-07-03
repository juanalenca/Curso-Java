package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe a média: ");
		double media = scan.nextDouble();
		
		
		boolean criterioDeAprovacao = media >= 7 && media <= 10;
		boolean criterioDeFinal = media >= 4 && media < 7;
	
		
		if(criterioDeAprovacao) {
			System.out.printf("A sua média é %.2f e você está aprovado :)", media);
		}else if (criterioDeFinal) {
			System.out.printf("A sua média é %.2f e você está na final.", media);
		}else {
			System.out.printf("A sua média é %.2f e você está reprovado :(", media);
		}
	    
	
		scan.close();
		
	}

}
