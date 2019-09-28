package trab3;

import java.util.ArrayList;

public class Assistente {
	private int volume;
	private int musica;
	private boolean tocando = false;
	private boolean ligado = false;
	
	static ArrayList<String> musicas = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;

		{
			add("Hunnybee - Unknow Mortal Orchestra." );
			add("Chinese New Year - SALES");
			add("Floating (feat. 21 savage) - ScHoolboyQ");
			add("Money trees (feat. Jay Rock) - Kendrick Lamar");
		}
	};
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int vol) {
		this.volume = vol;
	}
	
	public int getMusica() {
		return musica;
	}
	public void setMusica(int msc) {
		this.musica = msc;
	}
	
	public boolean isTocando() {
		return tocando;
	}
	public void setTocando(boolean toc) {
		this.tocando = toc;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	static void playlist(){
		for (String elem : musicas){
			System.out.println(elem);
		}
	}void aumentar() {
		if(tocando == true && volume < 10) {
			volume++;
			System.out.println("google: certo!");
		}else {
			System.out.println("*peça que algo seja reproduzido para aumentar o volume*");
		}
	}
	void diminuir() {
		if(tocando == true && volume >0) {
			volume--;
			System.out.println("google: blz!");
		}else {
			System.out.println("*peça que algo seja reproduzido para diminuir o volume*");
		}
	}
	void tocarmus() {
		if(tocando == false) {
			tocando = true;
			System.out.println("google: ok!");
		}else {
			System.out.println("tente: 'ok google', logo em seguida 'tocar'.");
		}
	}
	void proxmus() {
		if(tocando == true) {
			musica++;
			System.out.println("google: tudo bem!");
		}else {
			System.out.println("*nenhuma musica sendo reproduzida no momento*");
		}
	}
	void antemus() {
		if(tocando == true) {
			musica--;
			System.out.println("google: certo");
		}else {
			System.out.println("*nenhuma musica sendo reproduzida no momento*");
		}
	}
	void estaLigado(){
		if(ligado == false) {
			ligado = true;
			System.out.println("pling!");
			System.out.println("*para começar, diga: ok google*");
		}else {
			System.out.println("*desligando*");
			ligado = false;
		}
	}
	
}
