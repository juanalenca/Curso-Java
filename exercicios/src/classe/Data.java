package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	static String brasil = "Sempre uma merda!";
	
	
	
	Data() {
		
		// dia = 1;
		// data = 1;
		// ano = 1970;
		
		/*você também pode usar o this como 
		método dentro de um contrutor, para 
		um construtor chamar outros constutores
		através da chamada "this();"*/
		this(1, 1, 1970);
		
		/*
		 * byte, short, int, long -> 0
		 * float, double -> 0.0
		 * boolean -> false
		 * char -> '\u0000'
		 * Objetos -> null
		 * */
		
		/*
		variáveis locais não são inicializadas 
		por padrão, então inicialize elas antes 
		de usá-las e também é preciso inicializar
		as constantes antes de instanciá-las, pois 
		não recebem valor padrão
		int a;
		a = 0;
		System.out.println(a);
		*/
		
	}
	
	
	Data(int diaPadrao, int dataPadrao, int anoPadrao) {
		//this é uma instancia da classe serve para especificar o atributo da classe
		this.dia = diaPadrao;
		this.mes = dataPadrao;
		this.ano = anoPadrao;
	}
	
	
	
	
	
	String obterDataFormatada() {
		//or: dia +"/"+ data +"/"+ ano +"\n";
		final String formato = "%d/%d/%d\n";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	
	void imprimirDataFormatado() {
		System.out.println(obterDataFormatada());
	}
	
	
	/*por ser uma instancia da classe, ele não pode ser utilizado dentro de métodos staticos
	static void teste() {
		this.dia = 3;
	}
	*/
}