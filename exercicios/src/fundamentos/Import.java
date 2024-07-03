package fundamentos;

//imports sempre ficam fora da classe
import java.util.Date;
import java.util.Scanner;


public class Import {
	
	public static void main(String[] args) {

		Date data = new Date();
		Scanner scan = new Scanner(System.in);
		
		
		String msg = "Life could be dream...";
		
		//forma mais direta de se importar algo
		java.lang.String msgTwo = "tutututu so good so good";
		
		
		System.out.println(msg);
		System.out.println(msgTwo);
		System.out.println(data);
		
		
		scan.close();
		
	}

}
