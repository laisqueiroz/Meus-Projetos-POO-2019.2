package Pitolomeu;

import java.util.ArrayList;
import java.util.Map;

public class Cliente {
	private String id;
	private String nome;
	private ArrayList<String> nomeClientes = new ArrayList<String>();
	private ArrayList<String> apelidoClientes = new ArrayList<String>();
	
	public Cliente(String nome, String id){
		
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void addCliente(String id, String nome){
		nomeClientes.add(nome);
		apelidoClientes.add(id);
	}

	void historicoCliente(){
		
	}



	@Override
	public String toString() {
		return ;
	}
	
	
	
}

