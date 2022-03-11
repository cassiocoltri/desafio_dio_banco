package dioBanco;

public interface IConta {
// Por padrão, interfaces tendem a ser "publicas", logo colocar "public" nos métodos é redundante.
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
