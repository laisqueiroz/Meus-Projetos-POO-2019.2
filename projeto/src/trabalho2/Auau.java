package trabalho2;

public class Auau {
	private String nome;
	private String cor;
	private String tamanho;
	private boolean fome;
	private int barriguinha;
	private int maxBarriguinha = 10;
	private int minBarriguinha;
	private boolean roupinha;
	private boolean coleira;
	private boolean limpinho;
	private boolean cansado;
	
	
	public Auau(String n, String c, String t){
		this.setNome(n);
		this.setCor(c);
		this.setTamanho(t);
		this.fome = true;
		this.limpinho = true;
		this.cansado = false;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String c){
		this.cor = c;
	}
	
	public String getTamanho(){
		return this.tamanho;
	}
	
	public void setTamanho(String t){
		this.tamanho = t;
	}
	
	public void status(){
		System.out.println("Olá eu sou " + this.getNome() + "\n" + "Tenho " + this.getCor() + "\n" + 
							"Sou de " + this.getTamanho() + "\n" + "Fome? " + this.fome + "\n" + 
				   			"Minha Barruiguinha está com " + this.barriguinha + " de comida." + "\n" +
							"Se estou limpinho? " + this.limpinho + "\n" + "Se estou cansado? " + this.cansado);
	}
	
	public void comer(int nhame){
		if (fome == true && barriguinha < maxBarriguinha){
			barriguinha += nhame;
			System.out.println("nhame nhame");
			fome = false;
		}
		else if (fome == false && barriguinha < maxBarriguinha){
			if ((barriguinha + nhame) > maxBarriguinha){
				System.out.println("Não aguento comer isso tudo, você por acaso quer me matar?");
			}
			else if ((barriguinha + nhame) == maxBarriguinha){
				System.out.println("nhame nhame, estou de buxinho cheio!");
				barriguinha += nhame;
			}
			else if ((barriguinha + nhame) < maxBarriguinha){
				System.out.println("nhame nhame");
				barriguinha += nhame;
			}
		}
		else if (fome == false && barriguinha == maxBarriguinha){
			System.out.println("NÃO QUERO MAIS COMER! OKAY?!");
		}
	}
	
	public void vestir(){
		if (roupinha == false){
			roupinha = true;
			System.out.println("Que roupinha linda! *-*");
		}
		else {
			System.out.println("Eu já estou vestido não percebe?");
		}
	}
	
	public void tirarRoupinha(){
		if (roupinha == true){
			roupinha = false;
			System.out.println("LIVRE ESTOU!!!!!!");
		}
		else {
			System.out.println("Você ta tentando arrancar meu pelo? @.@");
		}
	}
	
	public void passear(){
		if (cansado == false && fome == false){
			if (coleira == true){
				System.out.println("Eu adoro passear! Vamos ao parque!!!");
				cansado = true;
				barriguinha -= 2;
				limpinho = false;
				if (barriguinha <= minBarriguinha){
					fome = true;
					System.out.println("ESTOU COM FOME!!!!");
				}
			}
			else if (coleira == false){
				System.out.println("Você vai mesmo sair comigo sem coleira?! " + "\n" + "Acho melhor não!");
			}
		}
		else if (cansado == false && fome == true){
			System.out.println("ESTOU COM FOME!!!!! Me alimente primeiro! u.u ");
		}
		else if (cansado == true){
			System.out.println("Me deixe tirar um cochilo primeiro! Depois nós vamos, ok?");
		}
	}
	
	public void setColeira(){
		this.coleira = true;
	}
	
	public void brincar(){
		if (cansado == false && fome == false){
			System.out.println("Já disse o quanto eu me adoro quando você brinca comigo?");
			cansado = true;
			barriguinha -= 1;
			if (barriguinha <= minBarriguinha){
				fome = true;
				System.out.println("Acho que brincamos demais, agora estou com fome!");
			}
		}
		else if (cansado == true){
			System.out.println("Não quero brincar agora!" + "\n" + "Vamos dormir um pouco, que tal?");
		}
	}
	
	public void esperar(){
		if (cansado == true){
			cansado = false;
			barriguinha -= 1;
			if (barriguinha <= minBarriguinha){
				System.out.println("PRECISO COMER!!!");
			}
		}
		else if (cansado == false){
			System.out.println("Você não me ama mais?" + "\n" + "porque não brinca comigo?" + "\n" + 
								"porque não quer passear?" + "\n" + "o que foi?" + "\n" + 
								"agora você prefere gatos?" + "\n" + "é isso?");
			barriguinha -= 1;
			if (barriguinha <= minBarriguinha){
				System.out.println("E ainda vai me matar de fome!");
			}
		}
	}
	
	public void banho(){
		if (limpinho == false){
			limpinho = true;
		}
		else if (limpinho == true){
			System.out.println("NÂO QUERO TOMAR BANHO!!!");
		}
	}
}

