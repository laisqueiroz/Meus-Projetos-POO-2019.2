package trabalho;

public class Nagazap {
	Repositorio<String , User> usuarios;
	Repositorio<String, String> grupos;
	
	public Nagazap(){
		usuarios = new Repositorio<String, User>();
		grupos = new Repositorio<String, String>();
		
	}
	
	
	public void addUser(String nome){
		usuarios.add(nome, new User(nome));
	}
	
	public void criarGrupo(String nomeUser, String nomeGrupo){
		if(grupos.exists(nomeGrupo)){
			System.out.println("Grupo já existe!");
		}
		else{
			if(usuarios.exist(nomeUser)){
				grupos.add(nomeGrupo, nomeGrupo);
			}
			else{
				System.out.println("User não existe");
			}
		}
	}
	
	public void removerUser(String nomeUser){
		if(usuarios.exist(nomeUser)){
			usuarios.remove(nomeUser);
		}
		else{
			System.out.println("User não existe!");
		}
	}
	
	public void deleteGrupo(String nomeGrupo){
		if(grupos.exist(nomeGrupo)){
			grupos.remove(nomeGrupo);
		}
		else{
			System.out.println("Grupo não existe!");
		}
	}
	
	public User getUser(String login) {
		return usuarios.get(login);
	}
	
	
	public void addUserinGrupo(User nomeUser, String nomeGrupo){
		
	}
	
	

	
	public String toString() {
		String saida = "";
		for(User usuario : this.usuarios.getAll())
			saida += usuario + "\n";
		return saida;
	}

}