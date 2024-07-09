package lambdas;

public class Somar implements Calculo{
	
	/*
	Eu sou obrigádo a declarar o método da interface que eu implemento
	já que os métodos de uma interface são abstratos e métodos abstratos 
	precisam ser declarados quando a classe a quem eles fazem parte são instanciadas
	*/
	@Override
	public double executar(double a, double b) {
		return a + b;
	}

}