package fundamentos.operadores;

public class DesafioAritmetricos {
	
	public static void main(String[] args) {
		
		//a classe Math permite que elevamos um numero a um determinado valor
		
		double valor1 = (6 * (3+2) );
		double v1 = Math.pow(valor1, 2) / 6;
		
		
		double valor2 = ((1 - 5) * (2 - 7)) / 2;
		double v2 = Math.pow(valor2, 2);
		
		
		double subV1V2 = Math.pow((v1 - v2), 3);
		double dezAoCUbo = Math.pow(10, 3);
		
		
		System.out.println(subV1V2 / dezAoCUbo);
		

		
	}

}
