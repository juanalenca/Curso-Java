package generics;

//Tornando a classe genérica através do <nomeQueVoceDesejar>
//E você defini o tipo dela nos seus instanciamentos
public class Caixa<T> {
	
	private T coisa;


	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}

}
