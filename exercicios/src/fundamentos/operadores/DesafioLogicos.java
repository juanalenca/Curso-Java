package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho terça (V ou F)
		//Trabalho quinta (V ou F)
		
		boolean work1 = false;
		boolean work2 = false;

		
		boolean comprouTv50 = work1 && work2;
		boolean comprouTv32 = work1 ^ work2;
		boolean comprouSorvete = work1 || work2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? "+comprouTv50);
		System.out.println("Comprou TV 32\"? "+comprouTv32);
		System.out.println("Comprou TV 32\" e sorvete? "+comprouSorvete);
		System.out.println("Mais saudável? "+maisSaudavel);
		
		
	}

}
