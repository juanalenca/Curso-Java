package oo.heranca.desafios;

/*
A interface serve para definirmos métodos para classes 
que ainda não possuem implementação/função. Um classe
só pode herdar de uma única classe, mas pode implementar
(implements) várias interfaces. Mas é obrigatório declarar 
os métodos da interface na classe que o implementa.
*/

public interface Esportivo {
	
	//por padrão, todo método de uma interface é public e abstract
	//um método abstract é um método que não tem corpo
	public abstract void ligarTurbo();
	void desligarTurbo();

}
