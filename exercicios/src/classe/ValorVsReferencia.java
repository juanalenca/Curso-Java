package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {


		double a = 2;
		double b = a; //atribuição por valor (tipo primitívo)
		
		a++;
		a--;
		
		System.out.println(a +" "+ b + "\n");
		
		
		
		Data d1 = new Data(24, 1, 2005);
		Data d2 = d1; //atribuição por referência (objeto)

		d1.dia = 6;
		d2.mes = 12;
		d2.ano = 2006;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		//Gera mudaça
		voltarDataValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		int c = 5;
		//não gera mudança
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	/*Quando passamos um objeto como como parâmetro para um método,
	dentro desse método você vai receber a referência do objeto 
	em memória*/
	static void voltarDataValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 2001;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}