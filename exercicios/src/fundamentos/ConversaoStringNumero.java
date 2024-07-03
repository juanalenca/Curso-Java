package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o 1° número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o 2° número: ");
		
	    System.out.println(valor1 + valor2);
	    
	    double numero1 = Double.parseDouble(valor1);
	    double numero2 = Double.parseDouble(valor2);
		
	    
	    double soma = numero1 + numero2;
	    System.out.printf("%s + %s = %f \n", valor1, valor2, soma);
	    System.out.printf("A média de %f é %f.", soma, soma/2);
	    
	    
	    
	    
	    
	}
	
}
