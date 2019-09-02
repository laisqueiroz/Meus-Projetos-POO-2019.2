package aula;

public class Carro {
	int numdePass;
	String nome;
	Motor motor;

	
	
	public Carro(String nome, int numdePass, int motor){
		this.nome = nome;
		this.numdePass = numdePass;	
		this.getMotor(motor);
	}
	
	public void acelerar (){
		if (motor == null){
			System.out.println();
		}
	}
	
}

