package classe;

public class AreaCircunferenciaTeste {

	public static void main(String[] args) {
		
		AreaCircunferencia a1 = new AreaCircunferencia(10);
		//a1.pi = 10;
		//a1.raio = 66;
		

		AreaCircunferencia a2 = new AreaCircunferencia(5);
		//a2.pi = 5;
		//a2.raio = 6;
		
		
		/*Como o valor de pi está agora associado diretamente a classe e não a instancia,
		não é uma boa prática acessarmos e modificarmos ele pelo instanciamento da classe
		(como nos casos acima), mas sim pela própria classe:
		Pois, ao modificármos ela, o seu valor será mudado globalmente*/
		
		//AreaCircunferencia.pi = 3.1415;
		
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		
		//chamando o método static a partir da classe, sem precisar instanciá-la
		System.out.println(AreaCircunferencia.areaInputClass(3));
		
		System.out.println("Nosso PI: " + AreaCircunferencia.PI);
		System.out.println("PI do JAVA: " + Math.PI);
 
	}

}