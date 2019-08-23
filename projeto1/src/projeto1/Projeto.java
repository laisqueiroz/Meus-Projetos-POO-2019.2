package projeto1;

import java.util.Scanner;

class Peixe{
	int barriga;
	int maxbarriga = 5;
	
	
	void comer() {
		if (barriga >= 0) {
			System.out.println("Seu peixe está alimentado.");
			barriga++;
		}
		else if (barriga > maxbarriga) {
			System.out.println("Seu peixe explodiu! CABUMMM!!!!");
		}
	}
	void passarTempo() {
		if (barriga > 0) {
			barriga--;
			System.out.println("Seu peixe está com fome!");
		}
		else if (barriga == 0) {
			System.out.println("Seu peixe morreu de fome!");
		}
	}
	
}

public class Projeto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Peixe marlin = new Peixe();
		System.out.println("Você quer alimentar, esperar ou ver status ?");
		while(true) {
			String Line = scanner.nextLine();
			if (Line.equals("alimentar")) {
				marlin.comer();
			}
			else if(Line.equals("esperar")) {
				marlin.passarTempo();
			}
			else if(Line.equals("fim")) {
				break;
			}
		}
		
	}

}
