package oo.abstrato;

public class TesteAbstract {

	public static void main(String[] args) {

		//só na classe Mamifero vocÊ tem acesso ao mamar()
		Mamifero a = new Cachorro();
				
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());

	}

}
