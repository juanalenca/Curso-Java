package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° número: ");
		double num1 = scan.nextDouble();

		System.out.println("Digite o 1° número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Qual operação deseja realizar (escreva assim: +, -, *, /, %)? ");
		String calculo = scan.next();
		
		
		double resultado = "+".equals(calculo) ? num1 + num2 : 0;
		resultado = "-".equals(calculo) ? num1 - num2 : resultado;
		resultado = "*".equals(calculo) ? num1 * num2 : resultado;
		resultado = "/".equals(calculo) ? num1 / num2 : resultado;
		resultado = "%".equals(calculo) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, calculo, num2, resultado); 
		
		
	        
	        
	    scan.close();
	        
	}

}
