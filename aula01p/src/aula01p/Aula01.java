package aula01p;

public class Aula01 {
	public static void main (String[] args) {
		/*int i;
		for (i = 150; i < 301; i++) {
			System.out.println (i);
		}*/
		int i = 1;
		int y = 1001;
		int x = 0;
		for (i = 1 ; i < y; i++) {
			x = i + x;
			System.out.println (x);
		}
	}
}