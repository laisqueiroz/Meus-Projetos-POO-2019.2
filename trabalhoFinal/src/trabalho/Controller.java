package trabalho;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Nagazap zapzap = new Nagazap();
		
		while(true){
			String Line = scanner.nextLine();
			String[] vet = Line.split(" ");
			
			if(vet[0].equals("sair"))
				break;
			else if (vet[0].equals("addUser"))
				zapzap.addUser(vet[1]);
			else if (vet[0].equals("listaUsers"))
				System.out.println(zapzap);
			else if (vet[0].equals("criarGrupo")){
				zapzap.criarGrupo(vet[1], vet[2]);
			}
			else if (vet[0].equals("listaGrupos"))
				System.out.println(zapzap.grupos);
			else if (vet[0].equals("removerUser"))
				zapzap.removerUser(vet[1]);
			else if (vet[0].equals("deletarGrupo"))
				zapzap.deleteGrupo(vet[1]);
			
		}
		
		scanner.close();
		

	}

}
