package trabalho;

import java.util.ArrayList;


public class Tweet {
	ArrayList<String> idLikes;
	String idUsuario;
    String msgm;
    int curtir;

    public String getMsg() {
        return msgm;
    }

    public void setMsg(String msg) {
        this.msgm = msg;
    }

    public String getIdUser() {
        return idUsuario;
    }

    public void setIdUser(String idUser) {
        this.idUsuario = idUser;
    }

    public Tweet(String idUser, String msg) {
        this.idUsuario = idUser;
        this.msgm = msg;
        this.curtir = 0;
        this.idLikes = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return msgm + " / curtidas = " + curtir + " /] " + idLikes;
    }

	public int getLikes() {
		return curtir;
	}

	public void setLikes(int curtidas) {
		this.curtir = curtidas;
	}

}
