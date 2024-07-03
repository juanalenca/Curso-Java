package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		
		//short
		Short s = 1000;
		
		//int
		//converti uma string em um valor inteiro
		//Integer.parseInt(scan.next()); 
		Integer i = 10000;
		
		//long
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 6);
		System.out.println(l / 3);
		
		
		//float
		Float f = 123.6F;
		System.out.println(f);
		
		
		//double
		Double d = 1234.9851;
		System.out.println(d);
		
		
		//boolean
		//convertando string para boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		
		//char
		Character c = '#';
		System.out.println(c.toString());
		
		
		
	}

}
