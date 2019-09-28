package herança;

import java.util.ArrayList;

class Unicornio{
	protected String nome;
	protected int poder;
	public Unicornio(String name){
		this.nome = name;
		this.poder = 0;
	}
	public String toString() {
		return "Unicornio : nome = " + nome + ", poder = " + poder ;
	}
	
	
}

class UnicornioMagico extends Unicornio{

	public UnicornioMagico(String name) {
		super(name);
		this.poder = 100;
	}
	public String toString(){
		String out = super.toString();
		return out;
	}
	public void voar(){
		this.poder -= 10;
		System.out.println("zUUUUUUUUmmm!");
	}
	
}

public class Controle {
	public static void main(String[] args) {
		ArrayList<Unicornio> mundo = new ArrayList<Unicornio>();
		Unicornio uni = new Unicornio("Uni");
		UnicornioMagico pony = new UnicornioMagico("Pony");
		mundo.add(pony);
		mundo.add(uni);
		mundo.add(new UnicornioMagico("felipe"));
		for (Unicornio unic : mundo){
			System.out.println(unic);
			if (unic instanceof UnicornioMagico){
				((UnicornioMagico) unic).voar();
			}
		}
	}

}
