package fundamentos;

public class Inferência {
	
	public static void main(String[] args) {
		
		//o tipo das variáveis são fixas, não podendo receber outros tipos de dados depois de declaradas
		//e valores flutuante pode receber valores inteiros, mas o contrário não pode acontecer em java
		double a = 4.5;
		System.out.println(a);
		
		//o tipo "var" vai inferir o tipo da variável com base no valor que você atribuir a ela
		//você precisa declará-la e inicializá-la ao mesmo tempo, não pode declarar e depois iniciar
		var b = 6.6;
		System.out.println(b);
		
		var c = "Olá!"; //automaticamente identifica o tipo do valor recebido
		System.out.println(c);
		
		double d;
		d = 134.62;
		System.out.println(d);
		
		var e = false;
		System.out.println(e);
		
	}

}
