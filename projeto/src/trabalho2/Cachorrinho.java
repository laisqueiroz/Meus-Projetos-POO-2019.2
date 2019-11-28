package trabalho2;

import java.util.Scanner;

public class Cachorrinho {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Auau dog = new Auau("Spike", "Pelo Castanho", "Médio Porte");
		dog.status();
		
		while(true){
			String Line = scanner.nextLine();
			String[] vet = Line.split(" ");
			if (vet[0].equals("alimentar"))
				dog.comer(Integer.parseInt(vet[1]));
			else if (vet[0].equals("status"))
				dog.status();
			else if (vet[0].equals("vestir"))
				dog.vestir();
			else if (vet[0].equals("tirar"))
				dog.tirarRoupinha();
			else if (vet[0].equals("coleira"))
				dog.setColeira();
			else if (vet[0].equals("passear"))
				dog.passear();
			else if (vet[0].equals("brincar"))
				dog.brincar();
			else if (vet[0].equals("esperar"))
				dog.esperar();
			else if (vet[0].equals("banhar"))
				dog.banho();
			else if (vet[0].equals("sair"))
				break;
		}
		scanner.close();
	}
}

