package saladeaula;

import java.util.Scanner;

public class SaladeAula {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();

		while (true) {
			System.out.println("adicionar aluno" + " / " + "quantidade alunos"
					+ "\n" + "lista alunos" + " / " + "idade alunos" + "\n"
					+ "remover aluno" + " / " + "mostrar aluno");
			String Line = scanner.nextLine();
			String[] vet = Line.split(" ");
			if (vet[0].equals("adicionar") && vet[1].equals("aluno"))
				aluno = new Aluno(vet[2], Integer.parseInt(vet[3]));
			else if (vet[0].equals("status"))
				aluno.status();
			else if (vet[0].equals("quantidade") && vet[1].equals("alunos"))
				System.out.println(Aluno.nextId);
			else if (vet[0].equals("lista") && vet[1].equals("alunos"))
				Aluno.mostrar();
			else if (vet[0].equals("idade") && vet[1].equals("alunos"))
				System.out.println(Aluno.age);
			else if (vet[0].equals("remover") && vet[1].equals("aluno"))
				Aluno.remover(Integer.parseInt(vet[2]));
			else if (vet[0].equals("mostrar") && vet[1].equals("aluno"))
				Aluno.exibir(Integer.parseInt(vet[2]));

			
	
		}
		
	}
}
