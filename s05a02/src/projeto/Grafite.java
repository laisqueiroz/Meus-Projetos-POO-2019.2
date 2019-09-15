package projeto;

public class Grafite {
	private int tamanhoGrafite;
	private Double ponta;
	
	public Grafite(int tam){
		this.tamanhoGrafite = tam;
	}

	private int getTamanhoGrafite() {
		return this.tamanhoGrafite;
	}

	public void setTamanhoGrafite(int tam) {
		this.tamanhoGrafite = tam;
	}

	private Double getPonta() {
		return ponta;
	}

	public void setPonta(Double pnt) {
		this.ponta = pnt;
	}
	
}
