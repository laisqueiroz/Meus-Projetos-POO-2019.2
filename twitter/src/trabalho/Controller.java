package trabalho;

import java.util.Scanner;

public class Controller {


	public static void main(String[] args) {
		TwitterSupremo u = new TwitterSupremo();
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			
			if (ui[0].equals("end"))
				break;
			else if (ui[0].equals("addUser"))
				TwitterSupremo.usuarios.addUser(ui[1]);
		}
	}
}