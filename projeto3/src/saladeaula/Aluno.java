package saladeaula;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int idade;
	static int nextId = 0;
	private int id;

	static ArrayList<String> alunos = new ArrayList<String>();
	static ArrayList<Integer> identificador = new ArrayList<Integer>();
	static ArrayList<Integer> age = new ArrayList<Integer>();

	public Aluno() {
	}

	public Aluno(String name, int idd) {
		this.nome = name;
		this.idade = idd;
		alunos.add(this.nome);
		age.add(this.idade);
		this.id = nextId;
		nextId++;
		identificador.add(this.id);
	}

	public static void remover(int prm) {
		alunos.remove(prm);
		identificador.remove(prm);
		age.remove(prm);
	}
	
	public static void mostrar(){
		int var = 0;
		for (String elem : alunos){
			System.out.print(identificador.get(var) + " " + elem);
			var++;
			System.out.println("\n");
		}
	}
	
	public static void exibir(int num){
		System.out.println(alunos.get(num));
	}

	void status() {
		toString(alunos);
	}

	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", id=" + id + "]";
	}
	
	


}