package oo.heranca;
public class Monstro extends Jogador {
	
	
	/*Por padão, toda classe tem um construtor padrão, 
	 * e esse construtor padão da sua classe pai, e se
	 * na classe pai não estiver definido o seu construtor 
	 * padrão, vocÊ precisa explicitamente definir o 
	 * construtor na classe filha e chamar o super passando
	 * os parâmetros corretos:*/
	public Monstro(){
		super(0, 0);
	}
	
	public Monstro(int x, int y){
		super(x, y);
	}
	
}
