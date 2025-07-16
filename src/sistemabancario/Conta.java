package sistemabancario;

public class Conta {
    Cliente titular;
    int numero;
   private double saldo;


     Conta(String nome, int numero, double saldo){
        if (titular == null){
            //lancar um erro no sistema
        }
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }
    public void modificarSaldo(double saldo){
         if(saldo >= 0){
             this.saldo = saldo;
         }else {
             System.out.println("Saldo não foi alterado. Valor negativo");
         }
    }
    public double obterSaldo(){
         return this.saldo;
    }
    void imprimirSaldo (){
        System.out.print(" Saldo atual para a conta: " + this.numero + " : " + this.saldo);


    }
}

