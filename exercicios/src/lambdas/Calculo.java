package lambdas;

//Essa annotation força você a ter apenas um método dentro da interface
//Já que funções lambdas só podem se relacionar com interfaces funcionais
@FunctionalInterface

public interface Calculo {
	
	//Por padrão, é public e abstract, ou seja, não é um método completo
	//E também é possível ter um método default e static
	double executar(double a, double b);
	
	default String cool() {
		return "Cool!";
	}
	
	//Métodos static podem ser chamados sem criar uma instância da classe
	static String soCool() {
		return "So Cool!!!";
	}

}