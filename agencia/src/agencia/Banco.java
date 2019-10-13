package agencia;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<Conta> contas;

    public Banco() {
        clientes = new ArrayList<Cliente>();
        contas = new ArrayList<Conta>();

    }

    public void adicionarCliente(String clt) {
        for (Cliente conta : clientes) {
            if (conta.getNome().equals(clt)) {
                System.out.println("Cliente já existe");
                return;
            }
        }
        Cliente cliente = new Cliente(clt);
        Conta cc = new ContaCorrente(clt);
        Conta cp = new ContaPolp(clt);
        this.clientes.add(cliente);
        cliente.addConta(cc);
        cliente.addConta(cp);
        this.contas.add(cc);
        this.contas.add(cp);
    }
    
    
    
    public void depositar(int ind, double valor){
        for (Conta conta : contas){
            if(ind == conta.getId()){
                conta.setSaldo(conta.getSaldo()+valor);
                return;
            }
        }
        System.out.println("Conta Não Encontrada");
    }
    
    public boolean sacar(int ind, double valor){
        for (Conta cnt : contas){
            if(valor <= cnt.getSaldo() && ind == cnt.getId()){
                cnt.setSaldo(cnt.getSaldo()-valor);
                return true;
            }
            else if(valor > cnt.getSaldo() && ind == cnt.getId()){
                System.out.println("Saldo Insuficiente!");
                return false;
            }
        }
        System.out.println("Conta Não Encontrada");
        return false;
    }
    
    public void tranferir(int ind1, int ind2, double valor){
        if(this.sacar(ind1, valor)){
            this.depositar(ind2, valor);
        }
    }
    
    public void status() {
        for (Conta conta : contas) {
            System.out.println(conta.getId() + ":" + conta.getNome() + ":" + conta.getSaldo() + ":" + conta.getTipo());
        }
    }
    
    public void update(){
        for (Conta conta : contas){
            if(conta.getTipo().equals("CC")){
                conta.setSaldo(conta.getSaldo()-20);
            }
            else{
                conta.setSaldo(conta.getSaldo()+(conta.getSaldo()*0.01));
            }
        }
    }
}