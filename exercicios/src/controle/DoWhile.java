package controle;

//ctrl+shift+o importa automaticamente
import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "";
		
		
		do {
			
			System.out.println("Você precisa falar" + "\nas palavras mágicas...");
			System.out.println("Deseja sair? ");
			text = scan.nextLine();
			
		}while(!text.equalsIgnoreCase("por favor"));
		 
		
		System.out.println("Obrigado!");

		scan.close();
		
	}

}
