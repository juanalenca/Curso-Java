package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um determinado dia da semana: ");
		String dia =  scan.next();
		
		if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 1° dia da semana.");
			
		}else if("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 2° dia da semana.");
			
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 3° dia da semana.");
			
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 4° dia da semana.");
			
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 5° dia da semana.");
			
		}else if("sabado".replace("á", "a").equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 6° dia da semana.");
			
		}else if("domingo".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 7° dia da semana.");
		}
		
		
		scan.close();

	}

}
