package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Digite algo: ");
			valor = scan.nextLine();
		}
		
		
		scan.close();
		
	}

}
