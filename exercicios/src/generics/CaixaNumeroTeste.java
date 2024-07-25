package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {

		//obrigatóriamente precisa ser relacionada a Number
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(6.6);
		System.out.println(caixaA.abrir());


		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(6);
		System.out.println(caixaB.abrir());
		

	}

}
