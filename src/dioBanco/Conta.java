package dioBanco;

public abstract class Conta implements IConta {
    /* A classe esta como "abstrata" para evitar que consigam no operador NEW criar uma conta SEM que
     seja defenida se será CC ou CP, isso vai obrigar a pessoa a creditar uma ou outra já que como
     a classe esta abstrata ele tem suas regrinhas de segurança. */

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;  // todo "new" vai receber sempre o que esta salvo na variavel +1.
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoConta() {
        System.out.printf("\nTitular: %s", this.cliente.getNome());
        System.out.printf("\nAgência: %d", this.agencia);
        System.out.printf("\nNúmero: %d", this.numero);
        System.out.printf("\nSaldo Atual: R$ %.2f\n", this.saldo);
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = this.saldo;
        if (saldoAtual <= valor) {
            System.out.println("Saldo insuficiente!\n");
        }
        else {
            this.saldo -= valor;
            System.out.println("Operação realizada com sucesso!");
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Operação realizada com sucesso!");;

    }

    @Override
    // Importante: é possível atribuir métodos dentro de métodos. Ajuda a economizar linhas de codigo.
    public void transferir(double valor, Conta contaDestino) {
        double saldoAtual = this.saldo;
        if (saldoAtual <= valor) {
            System.out.println("Saldo insuficiente!\n");
        } else {
            this.sacar(valor); // Método está chamando outro método que já vai fazer todas as verificações.
            contaDestino.depositar(valor);
        }
    }
}
