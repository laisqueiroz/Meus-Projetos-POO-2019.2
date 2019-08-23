package projeto1;

import java.util.Scanner;

class Peixe{
	int barriga = 0;
	int maxbarriga = 5;
	
	
	void alimentar() {
		if (barriga > maxbarriga) {
			System.out.println("Seu peixe explodiu! CABUMMM!!!!");
		}
		else if (barriga >= 0){
			barriga = barriga + 1;
			System.out.println("Peixe alimentado.");
		}
	}

	void esperar() {
		if (barriga > 0) {
			barriga = barriga - 1;
			System.out.println("Seu peixe está com fome!");
		}
		else if (barriga == 0) {
			System.out.println("Seu peixe morreu de fome!");
		}
	}
	void status() {
		System.out.println("barriga do peixe esta em " + barriga);
	}
	
}

public class scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Peixe marlin = new Peixe();
		System.out.println("alimentar, status ou esperar: ");
		while(true) {
			String Line = scanner.nextLine();
			String [] vet = Line.split(" ");			
			if (vet[0].equals("alimentar")) 
				marlin.alimentar();
			else if (vet[0].equals("status"))
				marlin.status();
			else if (vet[0].equals("esperar"))
				marlin.esperar();
			if (vet[0].equals("end")) 
				break;
				
		}
	}
		
}
