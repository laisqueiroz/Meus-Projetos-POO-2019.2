package Trabalho;

public class Controle {

	public static void main(String[] args) {
		Topic zona = new Topic(10, 2);
		System.out.println(zona);
		zona.embarcar(new Pass("João", 20, "1111"), 20);
		System.out.println(zona);
		zona.embarcar(new Pass("José", 62, "2222"), 62);
		System.out.println(zona);
		zona.embarcar(new Pass("Maria", 74, "3333"), 74);
		System.out.println(zona);
		zona.embarcar(new Pass("Pedro", 82, "4444"), 82);
		System.out.println(zona);
		zona.embarcar(new Pass("Daniel", 82, "5555"), 82);
		System.out.println(zona);
		zona.embarcar(new Pass("Lucina", 83, "6666"), 83);
		System.out.println(zona);
		zona.embarcar(new Pass("Jojo", 81, "7777"), 81);
		System.out.println(zona);
		zona.embarcar(new Pass("Giovana", 83, "8888"), 83);
		System.out.println(zona);
		zona.embarcar(new Pass("Caio", 84, "9999"), 84);
		System.out.println(zona);
		zona.embarcar(new Pass("Rodrigo", 25, "1010"), 25);
		System.out.println(zona);
		zona.embarcar(new Pass("Cibele", 16, ""), 16);
		System.out.println(zona);
		zona.remover("Pe");
		zona.remover("José");
		System.out.println(zona);
		zona.embarcar(new Pass("João", 10, "6666"), 10);
		zona.embarcar(new Pass("João", 10, "6666"), 10);
		System.out.println(zona);
		zona.embarcar(new Pass("Lais", 21, "1212"),  21);
		zona.embarcar(new Pass("Lais", 21, "1212"),  21);
		System.out.println(zona);
		
	}

}
