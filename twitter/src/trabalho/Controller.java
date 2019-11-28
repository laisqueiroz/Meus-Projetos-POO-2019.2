package trabalho;

import java.util.Scanner;


public class Controller {


	public static void main(String[] args) {
		
		try{
			Scanner scanner = new Scanner(System.in);
	        TwitterSupremo twitter = new TwitterSupremo();
	        
	        while(true){
	        String Line = scanner.nextLine();
			String[] vet = Line.split(" ");
			
			if (vet[0].equals("sair"))
				break;
			else if (vet[0].equals("addUser"))
				twitter.usuarios.add(vet[1], new User(vet[1]));
			else if (vet[1].equals("seguir"))
				twitter.seguir(vet[0], vet[2]);
			else if (vet[0].equals("users"))
				System.out.println(twitter.usuarios);
	        }
			
			/*
	        twitter.usuarios.add("Maria", new User("Maria Clara"));
	        twitter.usuarios.add("João", new User("João Sei-não"));
	        twitter.usuarios.add("Luis", new User("Luis Felipe"));
	        twitter.usuarios.add("Joana", new User("Joana Maria"));
	        
	        twitter.seguir("Maria", "João");
	        twitter.seguir("Luis", "João");
	        twitter.seguir("Joana", "Luis");
	        twitter.seguir("Joana", "Maria");
	        twitter.seguir("João", "Maria");
	        twitter.seguir("Maria", "Joana");
	        
	        System.out.println(twitter.usuarios);

	        twitter.twittar("João", "Hoje tá quente");
	        twitter.twittar("Maria", "Não guento mais");
	        twitter.twittar("Joana", "Já cansei");
	        twitter.twittar("Luis", "Se o trabalho é para amanhã eu só vou fazer amanhã");
	        twitter.twittar("Maria", "Hoje é prova");

	        System.out.println(twitter.usuarios.get("Maria").timeLine());
	        
	        twitter.like("João", "Maria", 0);
	        twitter.like("João", "Maria", 1);
	        twitter.like("Joana", "Maria", 1);

	        System.out.println(twitter.usuarios.get("Maria").timeLine());
	        */
	        
	        scanner.close();
	        }
	        catch (RuntimeException e){
	            System.out.println(e.getMessage());
	        }
		
	}
}