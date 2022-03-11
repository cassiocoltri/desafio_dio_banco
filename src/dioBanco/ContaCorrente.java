package dioBanco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente client) {
        super(client);
    }

    @Override
    public void imprimirExtrato() {
        System.out.print("|||||||||| Extrato Conta Corrente ||||||||||");
        super.imprimirInfoConta();

    }
}

/*Toda a vez que alguém criar um "new ContaCorente()" ela vai pega os atributos daqui, a "AGENCIA" sempre
* vai ser a mesma pq ela tem um atributo constante/final na classe CONTA onde esta herdando os dados.
* Já o número da agência vai ser sequencial, pois toda fez que o "new" é criado, vai acrescentar +1 na
* propriedade do métodos.*/