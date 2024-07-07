package oo.encapsulamento;

public class Pessoa {
	
	
	private String nome;
	private int idade;
	private String sobrenome;
	
	
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);	
		setSobrenome(sobrenome);	
		setIdade(idade);
	}
	

	
	//ler - Getter
	public String getNome() {
		return nome;
	}

	//alter - Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	public String getnomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		
		novaIdade = Math.abs(novaIdade);
		
		if(novaIdade >= 0 && novaIdade <= 130) {
			this.idade = novaIdade;
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Hello, World! My name is " + getNome() 
		+ " and I'm "+ getIdade() +" years old.";
	}
	

}
