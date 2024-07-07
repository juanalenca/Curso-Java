package oo.abstrato;

/*
Uma classe abstrata não pode ser instanciada e pode ter tanto métodos
abstratos quanto métodos completos, mas só é possível uma classe ter 
um método abstrato se ela for abstrata. Além disso, quando uma classe 
extends uma classe abstrata, ela precisa obrigatóriamente declarar 
todos os métodos abstratos da classe abstract. Porém, se você estiver 
extends uma classe abstract que extends outra classe abstract, então 
não precisa declarar os métodos da classe abstract primária, apenas os 
métodos da classe que você está extends no momento. Entretanto, se você 
está extends uma classe abstract que não declarou os métodos da classe 
abstrata que ela está extendendo, essa  ultima classe (a que extende essa 
classe que não declarou os métodos desde a classe abstract) vai ter que  
delcarar todos os métodos abstratos de todas as classses abstratas anteriores
*/

public abstract class Animal {
	
	public String respirar() {
		return "Usando oxigênio";
	}
	
	public abstract String mover();

}
