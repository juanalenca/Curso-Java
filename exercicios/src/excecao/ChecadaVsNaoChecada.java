package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Fim :)");

	}
	
	
	//Exceção não checada ou não verificada
	static void geraErro1() {
		//Não basta criar o erro, temos que lançá-lo: throw
		// lançando o novo erro através do throw
		throw new RuntimeException("Ocorreu o erro #01");
	}
	
	
	//Exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new RuntimeException("Ocorreu o erro #02");
	}
	
	
	

}
