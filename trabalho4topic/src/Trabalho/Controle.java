package Trabalho;

public class Controle {

	public static void main(String[] args) {
		Topic zona = new Topic(10, 2);
		System.out.println(zona);
		zona.embarcar(new Pass("João", 20, "1111"), 20);
		zona.embarcar(new Pass("José", 62, "2222"), 62);
		zona.embarcar(new Pass("Maria", 74, "3333"), 74);
		zona.embarcar(new Pass("Pedro", 82, "4444"), 82);
		zona.embarcar(new Pass("P", 82, "4"), 82);
		zona.embarcar(new Pass("Pe", 82, "44"), 80);
		zona.embarcar(new Pass("Ped", 82, "444"), 81);
		zona.embarcar(new Pass("Pedr", 82, "1"), 83);
		zona.embarcar(new Pass("o", 82, "11"), 84);
		zona.embarcar(new Pass("ro", 82, "111"), 85);
		zona.embarcar(new Pass("dro", 82, "2"), 86);
		System.out.println(zona);
		zona.remover("Pe");
		zona.remover("José");
		System.out.println(zona);
		zona.embarcar(new Pass("João", 20, "6666"), 20);
		zona.embarcar(new Pass("João", 20, "6666"), 20);
		System.out.println(zona);
		zona.embarcar(new Pass("Lais", 21, "1212"),  21);
		zona.embarcar(new Pass("Lais", 21, "1212"),  21);
		System.out.println(zona);
		
	}

}
