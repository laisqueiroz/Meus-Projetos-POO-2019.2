package trabalho;

import java.util.Map;
import java.util.TreeMap;

public class Repositorio <T> {
	Map<String, T> dados;
	String tipo;
	
	public Repositorio(String tipo) {
		super();
		this.dados = new TreeMap<String, T>();
		this.tipo = tipo;
	}
	
	public void addUser(String id, T usuario){
		T user = dados.get(id);
		if (user == null){
			dados.put(id, usuario);
		}
		else {
			throw new RuntimeException(tipo + " " + id + " ja existe");
		}
	}
	
	public void seguir(String seguidor, T usuario){
		T user = dados.get(seguidor);
		if (user == null){
			dados.put(seguidor, usuario);
		}
		else {
			throw new RuntimeException(tipo + " " + seguidor + " ja existe");
		}
	}
	
	
	
}
