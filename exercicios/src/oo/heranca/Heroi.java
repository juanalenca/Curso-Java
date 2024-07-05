package oo.heranca;
/*
* A classe Heroi está herdando a
* classe Jogador através do extends
* ou seja, Heroi vai herda os atributis
* e métodos da sua classe mãe, Jogador
* */
public class Heroi extends Jogador {
	boolean atacar(Jogador oponente) {
		//chmando um método super/pai
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
	}
}
