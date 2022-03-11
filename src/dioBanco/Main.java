package dioBanco;

// Projeto desenvolvido com IntelliJ IDEA Community Edition 2021.3.2
// Extenção Lombok NÂO é compativel dessa versão, optei por usar o Intelij no lugar do Eclipse.

public class Main {
    public static void main(String[] args) {

        Cliente juquinha = new Cliente();  // cadastrando o cliente no "banco"
        juquinha.setNome("Juquinha");

        // Agora, dá de atribuir o cliente novo tanto para cc como poupanca
        Conta cc = new ContaCorrente(juquinha);
        Conta poupanca = new ContaPoupanca(juquinha);

        cc.depositar(200);
        cc.transferir(1000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.sacar(999);
        cc.imprimirExtrato();

    }
}
