package ventilador;

public class Ventilador 
{
	boolean estaligado;
	int velocidade;
	boolean girando;
	boolean estaVentilando;
	
	
	void ligar (){
		if(estaligado == false) {
			System.out.println("ligando o ventilador");
			estaligado = true;
		}
	}
	
	void desligar (){
		if(estaligado == true){
			System.out.println("Desligando o Ventilador");
			estaligado = false;
		}
	}
	
	void girar (){
		if(estaligado == true && girando == false){
			System.out.println("Colocar para girar");
			girando = true;
			System.out.println("ventilador girando");
			
		}
		else {
			System.out.println("o ventilador não pode girar pois está desligado");
		}
	}
	void parardegirar (){
		if (estaligado == true && girando == true){
			System.out.println("Parar de girar o ventilador");
			girando = false;
			System.out.println("O ventilador está parado");
		}
		else {
			System.out.println("O ventilador está parado");
		}
	}
	void aumentarvelocidade (){
		if (estaligado == true && velocidade < 3){
			velocidade = velocidade + 1;
		}
		else {
			System.out.println("A velocidade não pode ser aumentada!");
		}
	}
	void diminuirvelocidade () {
		if (estaligado == true && velocidade > 0) {
			velocidade = velocidade - 1;
			if (velocidade == 0) {
				System.out.println("");
			}
		}
	}

	void showStatus () 
	{ 
		System.out.println("Ligado =" + estaligado + 
							", Velocidade =" + velocidade +  
							", Girando =" + girando);
	}
	public static void main(String[] args) 
	{
		Ventilador arno = new Ventilador();
		arno.showStatus();
		arno.ligar();
		arno.girar();
		arno.desligar();
		arno.girar();

	}

}
