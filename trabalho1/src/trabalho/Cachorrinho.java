package trabalho;

import java.util.Scanner;

class Dog {
	int barriguinha;
	int maxBarriguinha = 5;
	boolean limpinho = true;
	boolean cansado = false;
	
	
	void status(){
		System.out.println("Barriguinha = " + barriguinha); 
		System.out.println("Limpinho = " + limpinho); 
		System.out.println("Cansado = " + cansado);
	}
	void comer(){
		if (barriguinha < maxBarriguinha){
			System.out.println("AU! AU!");
			barriguinha++;
		}
		else if (barriguinha == maxBarriguinha){
			System.out.println("AU!");
		}
	}
	void brincar(){
		if (barriguinha == 0 || cansado == true){
			System.out.println("AU!");
		}
		else {
			System.out.println("AU! AU!");
			barriguinha--;
			cansado = true;
		}
	}
	void passear(){
		if (barriguinha == 0 || cansado == true){
			System.out.println("AU!");
		}
		else{
			System.out.println("AU! AU!");
			barriguinha--;
			limpinho = false;
		}
	}
	void banhar(){
		if (limpinho == false){
			System.out.println("AU! AU!");
			limpinho = true;
		}
		else {
			System.out.println("AU!");
			System.out.println("AU! AU! AU!");
		}
	}
	void passarTempo(){
		barriguinha--;
		cansado = false;
		if (barriguinha == 0){
			System.out.println("AU! AU! AU! AU! AU!");
		}
	}
}

public class Cachorrinho {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Dog beleta = new Dog();
		
		//System.out.println("AU! = nao | AU! AU! = feliz | Au! AU! AU! = raiva | AU! AU! AU! AU! AU! = fome" );
		System.out.println("AU!, AU! AU! AU! AU!");
		System.out.println("status, alimentar, brincar, passear, banhar, esperar");
		while(true){
			String Line = scanner.nextLine();
			System.out.println("AU! = nao | AU! AU! = feliz | Au! AU! AU! = raiva | AU! AU! AU! AU! AU! = fome" );
			if (Line.equals("alimentar"))
				beleta.comer();
			else if (Line.equals("brincar"))
				beleta.brincar();
			else if (Line.equals("passear"))
				beleta.passear();
			else if (Line.equals("banhar"))
				beleta.banhar();
			else if (Line.equals("esperar"))
				beleta.passarTempo();
			else if (Line.equals("status"))
				beleta.status();
			else if (Line.equals("sair"))
				break;
		}
	}
}
