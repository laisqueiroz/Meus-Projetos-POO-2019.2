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
	
	public Aluno(){
		this.nome = null;
		this.idade = 0;
		alunos.add(this.nome);
		age.add(this.idade);
		this.id = nextId;
		nextId++;
		identificador.add(this.id);	
	}
	
	public Aluno(String name, int idd){
		this.nome = name;
		this.idade = idd;
		alunos.add(this.nome);
		age.add(this.idade);
		this.id = nextId;
		nextId++;
		identificador.add(this.id);	
	}
	static void status(){
		System.out.println(alunos);
		System.out.println(identificador);
	}
}	