package Trabalho;

public class Pass {
	private String id;
	private String ticket;
	private int idade;
		
		
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pass(String id, int idade, String ticket) {
		super();
		this.id = id;
		this.setIdade(idade);
		this.ticket = ticket;
	}

	public String toString() {
		return "Nome: " + id + ": " + ticket;
	}
		
}
