package apostila;

public class Conta {
	private String titular;
	private float saldo;
	private float deposito;
	private float saque;
	
	public Conta(String nome, float dep){
		this.titular = nome;
		this.saldo = dep;
		this.deposito += dep;
	}
	public Conta(){
		
	}
	
	public void status(){
		System.out.println("Titular: " + this.titular + "\n" + "Saldo: R$" + this.saldo);
	}
	
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public float getDeposito() {
		return deposito;
	}
	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}
	
	public float getSaque() {
		return saque;
	}
	public void setSaque(float saque) {
		this.saque = saque;
	}
}
