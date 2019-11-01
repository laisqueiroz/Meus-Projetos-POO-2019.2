package trabalho;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class Reposit<T>{
	public Map<String, T> usuarios;
}

public class User {
	public String id;
	public Map<String, User> seguindo;
	public Map<String, User> seguidores;
	public ArrayList<String> timeline;
	public Map<String, User>  usuarios;
	
	public User(String id) {
		super();
		this.id = id;
	}
	
	public User(){
		this.id = null;
	}
	
	@Override
	public String toString() {
		return "" + id + "\n" + "  seguindo " + seguindo + "\n" + "  seguidores "
				+ seguidores;
	}


	
}
