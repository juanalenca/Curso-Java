package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Informações o funcionário
		
		//Tipos numéricos
		byte anosDeEmpresa = 26;
		short numeroDeVoos = 666;
		int id = 1621647;
		//é preciso colocar o L no final do número do tipo long
		long pontosAcumulados = 3_234_845_223L;
		
		
		//Tipos numéricos
		float salario = 11_445.44F; //é preciso colocar o F no final do número do tipo float caso ele passe de duas casas
		double  vendasAcumuladas = 2_991_897_987.01;
		
		//Tipo booleano
		boolean estaDeFerias = true; //or false
		
		//tipo caractere
		char status = 'J'; //apenas um caracter, seja numero ou texto
		
		//Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
	    System.out.println(pontosAcumulados / vendasAcumuladas);
	    
	    System.out.println("id: " + id + " | Salário: " + salario);
	    System.out.println("Férias? "+estaDeFerias + "!");
	    System.out.println("Status: "+status);
	
	}

}
