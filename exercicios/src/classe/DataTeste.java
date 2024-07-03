package classe;

public class DataTeste {

	public static void main(String[] args) {


		Data d1 = new Data();
		
		Data d2 = new Data(27, 12, 1962);
		//d2.dia = 27;
		//d2.data = 12;
		//d2.ano = 1962;
		
		//System.out.printf("%d/%d/%d\n", d1.dia, d1.data, d1.ano);
		//System.out.printf("%d/%d/%d\n", d2.dia, d2.data, d2.ano);
		
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		
		d1.imprimirDataFormatado();
		d2.imprimirDataFormatado();
		
		System.out.println(Data.brasil);
		

	}

}