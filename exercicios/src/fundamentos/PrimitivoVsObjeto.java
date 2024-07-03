package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		//a String é uma classe e o seu valor é o seu objeto
		String s = "texto";
		s.toUpperCase();
		
		
		//Tudo em java é objeto, menos os tipos primitivos
		//Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
		
		
	}

}
