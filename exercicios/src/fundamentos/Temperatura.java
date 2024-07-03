package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		//(°F - 32) * 5/9 = °C
		
		double fahrenheit = 86;
		double celcius = 34;
		final double EQUIVALENCIA = 1.8;
	    final int PONTO_CONGELAMENTO = 32;
	    final double AUMENTO_POR_GRAU = 5.0/9.0;
	    
	    double convercaoCelcius = (fahrenheit - PONTO_CONGELAMENTO) * AUMENTO_POR_GRAU;
	    System.out.println("86°F equivale a "+convercaoCelcius+"°C.");

	    double convercaoFahrenheit = celcius * EQUIVALENCIA + PONTO_CONGELAMENTO;
	    System.out.println("34°C equivale a "+convercaoFahrenheit+"°F.");
	    
		
	}

}
