package sistemabancario;

public class Banco {

    void depositar (Conta conta,double valor ){
        double saldoAtual = conta.obterSaldo();
        double novoSaldo = saldoAtual+valor;
        conta.modificarSaldo(novoSaldo);

    }
    void sacar(Conta conta, double valor){
        double saldoAtual = conta.obterSaldo();
        double novoSalvo = saldoAtual - valor;
        if(novoSalvo < 0){
            System.out.println("Naõ foi possível sacar, o saldo ficará negativo!");

        }else{
            conta.modificarSaldo(novoSalvo);
        }

    }

    void transferir(Conta origem, Conta destino, double valor){
        double saldoAtualOrigem = origem.obterSaldo();
        double novoSaldoOrigem = saldoAtualOrigem - valor;
        if(novoSaldoOrigem <0){
            System.out.println("Transfênria não realizada! Saldo insuficiente");

        }else {
            origem.modificarSaldo(novoSaldoOrigem);
            double novoSaldoDestino = destino.obterSaldo() + valor;
            destino.modificarSaldo((novoSaldoDestino));
        }

    }
}
