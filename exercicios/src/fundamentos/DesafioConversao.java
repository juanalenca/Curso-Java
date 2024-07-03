package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° salário: ");
		String salario1 = scan.nextLine().replace(",", ".");

		System.out.println("Digite o 2° salário: ");
		String salario2 = scan.nextLine().replace(",", ".");
		
		System.out.println("Digite o 3° salário: ");
		String salario3 = scan.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double mediaSalario = (s1+s2+s3)/3; 
		
		System.out.printf("A média dos três salários é %.2f", mediaSalario);
		
		scan.close();

	}

}
