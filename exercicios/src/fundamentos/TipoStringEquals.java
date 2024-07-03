package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		
		System.out.println("2" == "2"); // true
		
		
		String num = new String("2");
		System.out.println("2" == num); // false
		
		//O método equals compara os conteúdos das strings
		System.out.println("2".equals(num)); // true
		
		
		
		Scanner scan = new Scanner(System.in);
		
		//E o next() tira os espaços em branco por padrão, o nextLine não
		String S2 = scan.next();
		System.out.println("2" == S2.trim()); // false
		System.out.println("2".equals(S2.trim())); // true e esse método que tira os espaços em branco que o usuário faz
		
		
		
		scan.close();
		
		
	}

}
