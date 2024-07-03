package classe;

public class Usuario {
	
	String nome;
	String email;
	
	/* Gerado pelo eclipse automaticamente
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	*/
	

	@Override
	public boolean equals(Object objeto) {
		
		/*O operador instanceof compara se o objeto 
		que foi passado no equals é uma instancia de Usuario:
		if(objeto instanceof Usuario) {
			//convertendo um objeto para Usuario
			Usuario outro = (Usuario) objeto;
			
			return super.equals(objeto);
		}else {
			return false;
		}
		*/
		
		
		//O operador instanceof compara se o objeto 
		//que foi passado no equals é uma instancia de Usuario:
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}else {
			return false;
		}
		
		
		
	}
	
	//O hascode será abordado em outra aula
	
	@Override
	public int hashCode() {
		return 0;
	}
	
}