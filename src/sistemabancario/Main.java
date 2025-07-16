package sistemabancario;

public class Main {
    public static void main (String[] args){

    Cliente fulano = new Cliente("61564350907", "fulano");

    Conta contaFulano = new Conta("fulano", 1000, 50);

    System.out.println("Saldo da conta Fulano:" + contaFulano.obterSaldo());
    Banco sistemabancario = new Banco();
    System.out.println(" Saldo antes do depósito");
    contaFulano.imprimirSaldo();

    System.out.println(" Depositando 100 reais");
    sistemabancario.depositar(contaFulano, 100d);

    System.out.println(" Saldo depois do depósito");
    contaFulano.imprimirSaldo();


    System.out.println("Sacando o valor de 30 reais");
    sistemabancario.sacar(contaFulano, 30d);

    contaFulano.imprimirSaldo();

    Cliente cicrano = new Cliente("Cicrano", "87654367509");

    Conta contaCicrano = new Conta("Cicrano", 2000, 0);
    System.out.println("Adicionando saldo negativo na conta");
    contaCicrano.modificarSaldo(-50);
    System.out.println("Transferindo 120 reais para o cicrano");
    sistemabancario.transferir(contaFulano, contaCicrano, 120d);

    contaFulano.imprimirSaldo();
    contaCicrano.imprimirSaldo();









    }
}
