package oo.heranca.desafios;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	/*
	implementação padrão para métodaos na interface, 
	fazendo com que não seja obrigatório declará-la
	*/
	default int velocidadeDoAr() {
		return 1;
	}
	
}
