package trabalho;

public class User {
	String nome;
	
	public User(){
		
	}
	
	public User(String nome){
		this.nome = nome;
		
	}
	
	@Override
	public String toString() {
		return "[" + nome + "]";
	}
	
	

}
