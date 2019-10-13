package agencia;

public class Controller {

    public static void main(String[] args) {
        Banco DosEstudantes = new Banco();
        DosEstudantes.adicionarCliente("Lais");
        DosEstudantes.adicionarCliente("Alguem");
        DosEstudantes.status();
        DosEstudantes.depositar(1, 100);
        DosEstudantes.status();
        DosEstudantes.tranferir(1, 3, 30);
        DosEstudantes.sacar(1, 20);
        DosEstudantes.status();
    }
}
