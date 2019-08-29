package exercicio;

import java.util.Scanner;

public class Unicornio {
	int nPass;
	int nPassMax;
	int carinhometro;
	int carinhometroMax;
	int km;
	
	void status(){
		System.out.println("Número de Passageiros = " + nPass + " Quantidade de carinho = " + carinhometro + " Km rodados = " + km);
	}
	
	void subir(int pss){
		if (nPass < nPassMax){
			nPass += pss;
		}
		else if (nPass == nPassMax){
			System.out.println("Não suborto mais >.< ");
		}
	}
	void descer(int pss){
		if (nPass > 0){
			nPass -= pss;
		}
		else if (nPass == 0){
			System.out.println("Não tem ninguém aqui!!! @.@");
		}
	}
	
	public static void main(String[] args) {
		Unicornio uni = new Unicornio();
		
		Scanner scanner = new Scanner(System.in);
		String line;
		System.out.println("Comandos = status; subir; descer;");
		while(true){
			line = scanner.nextLine();
			String[] vet = line.split(" ");
			if (vet[0].equals("status"))
				uni.status();
			else if (vet[0].equals("subir"))
				uni.subir(Integer.parseInt(vet[1]));
			else if (vet[0].equals("descer"))
				uni.descer(Integer.parseInt(vet[1]));
			else 
				System.out.println("Comando Inválido");
			
		}
		

	}

}
