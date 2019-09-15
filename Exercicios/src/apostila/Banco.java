package apostila;

import java.util.Scanner;

public class Banco {
	Conta conta;
	
	public static void main(String[] args) {
		Conta novaConta = new Conta("Lais", 20.0f);
		Scanner scanner = new Scanner(System.in);
		novaConta.status();
		Conta outraConta = new Conta();
		outraConta.status();
		while(true){
			String Line = scanner.nextLine();
			String[] vet = Line.split(" ");
			if (vet[0].equals("Criar"))
				Conta maisConta = new Conta();
		}
	}

}
