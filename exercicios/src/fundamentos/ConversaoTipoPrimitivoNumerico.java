package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		//conversão implícita
		double a = 1;
		System.out.println(a);
		
		
		/*
		É preciso colocar o F no final do numero 
		quando for usar o float ou você pode fazer 
		dessa forma: float b = (float) 1.0; 
		-> que é uma conversão explícita (CAST)
		*/
		float b = 6.9F;
		System.out.println(b);
		
		
		/*
		 Aqui vocÊ está fazendo uma conversão explícita, 
		 mas está perdendo informação, pois o tipo que está 
		 recebendo o valor não o suporta, assim ocorre a perda
		 de informações
		 */
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);
		
		
		double e = 9.999;
		int f = (int) e;
		System.out.println(f);
		
	}
}
