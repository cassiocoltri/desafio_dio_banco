package dioBanco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente client) {
        super(client);
    }

    @Override
    public void imprimirExtrato() {
        System.out.print("|||||||||| Extrato Conta Poupanca ||||||||||");
        super.imprimirInfoConta();

    }
}
