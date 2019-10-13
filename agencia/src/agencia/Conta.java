package agencia;

public abstract class Conta {
    static int nextId = 0; 
    private int id = 0;
    private String nome;
    private double saldo;
    private String tipo;
    
    public Conta() {
    	
    }
    
    public Conta(String nome, double saldo, String tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Conta.nextId = nextId;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}