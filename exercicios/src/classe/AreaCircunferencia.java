package classe;

public class AreaCircunferencia {
	
	double raio;
	/*o static define que a determinada variável está 
	associado diretamente a classe não as instancias. E
	você também pode definir como final e static ao 
	mesmo tempo*/
	final static double PI = 3.1415;
	
	
	/*Construtor que obriga que a o valor de raio seja 
	passado como um parâmetro no instanciamento da classe
	e que define um valor padão para a variável pi*/ 
	AreaCircunferencia(double raioInicial) {
		//pi = 3.14;
		raio = raioInicial;
	}
	
	
	double area() {
		/*O método pow é static, pois não precisamos instanciar 
		a classe Math para ter acesso a ele, já que ele pertece 
		diretamente a classe Math*/
		return PI * Math.pow(raio, 2);
	}
	
	//método static
	static double areaInputClass(double raio) {
		return PI * Math.pow(raio, 2);
	}
	

}