package agencia;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nome) {
        this.setId(nextId);
        nextId++;
        this.setTipo("CC");
        this.setNome(nome);
        this.setSaldo(getSaldo());
    }
}