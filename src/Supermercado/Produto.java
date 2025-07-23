// Produto.java
package Supermercado;

public class Produto {
    String nomeProduto;
    int quantidade;

    public Produto(String nomeProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public void imprimirProduto() {
        System.out.println("Produto: " + this.nomeProduto);
        System.out.println("Quantidade: " + this.quantidade);
    }

    public String getTipoProduto() {
        return "Genérico";
    }
}




