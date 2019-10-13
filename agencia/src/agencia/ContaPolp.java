package agencia;

public class ContaPolp extends Conta {

    public ContaPolp(String nome) {
        this.setId(nextId);
        nextId++;
        this.setTipo("CP");
        this.setNome(nome);
        this.setSaldo(getSaldo());
    }

}