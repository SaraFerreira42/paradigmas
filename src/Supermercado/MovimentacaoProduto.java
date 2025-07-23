// MovimentacaoProduto.java
package Supermercado;

public class MovimentacaoProduto {

    void entrar(EstoqueProduto estoque, int quantidade) {
        estoque.quantidade += quantidade;
        System.out.println("Entrada realizada. Estoque agora tem: " + estoque.quantidade + " " + estoque.nomeProduto);
    }

    void sair(EstoqueProduto estoque, int quantidade) {
        if (estoque.quantidade < quantidade) {
            System.out.println("QUANTIDADE INSUFICIENTE. Estoque atual: " + estoque.quantidade);
        } else {
            estoque.quantidade -= quantidade;
            System.out.println("Saída realizada. Estoque agora tem: " + estoque.quantidade);
        }
    }

    void verificar(EstoqueProduto estoque) {
        System.out.println("Estoque atual do produto " + estoque.nomeProduto + ": " + estoque.quantidade);
    }
}



