package aulapratica;

import java.util.ArrayList;

int atm;

public class Treino {
	public static void status(ArrayList<Integer> array){
		for (Integer elem : array){
			System.out.print(elem + " ");
		}
		System.out.print("\n");
		
	}
	public static void aumentar(ArrayList<Integer> ray){
		for (Integer elem : ray){
			System.out.print(elem + " ");
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		status(lista);
		lista.add(0, 0);
		status(lista);
		lista.remove(1);
		status(lista);
		lista.set(0,1);
		status(lista);
		lista.set(0,0);
		lista.set(1,1);
		lista.add(2);
		status(lista);
		aumentar(lista);
		status(lista);
		}
  
}
