package saladeaula;

import java.util.Scanner;

public class Sala {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		while(true){
			System.out.println("adicionar aluno" + "\n" + "quantidade alunos" + "\n" + "lista alunos" + "\n" + "idade dos alunos" + "\n" + "remover aluno");
			String Line = scanner.nextLine();
			String[] vet = Line.split(" ");
			if (vet[0].equals("adicionar") && vet[1].equals("aluno"))
				aluno = new Aluno(vet[2], Integer.parseInt(vet[3]));
			else if (vet[0].equals("status"))
				Aluno.status();
			else if (vet[0].equals("quantidade") && vet[1].equals("alunos"))
				System.out.println(Aluno.nextId);
			else if (vet[0].equals("lista") && vet[1].equals("alunos"))
				System.out.println(Aluno.alunos);
		}
	}
}