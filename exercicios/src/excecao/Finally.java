package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {

			System.out.println(7 / scan.nextInt());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { //sempre o finally será chamado, independente de erro ou não
			System.out.println("Finally... #01");
		}
		
		try {
			
			System.out.println(7 / scan.nextInt());
			
		} finally {  
			System.out.println("Finally... #02");
			scan.close();
		}
		
		System.out.println("Fim.");
		

	}

}
