package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 6.6;
		
		
		//Lógica ->              operação   ?    true     :    false
		String resultParcial = media >= 4.0 ? "na final!" : "reprovado :(";
		
		String resultadoFinal = media >= 7 ? "aprovado!" : resultParcial;
		
		
		System.out.printf("O aluno está %s", resultadoFinal);
		
	}
	
}
