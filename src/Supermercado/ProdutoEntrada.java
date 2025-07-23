// ProdutoEntrada.java
package Supermercado;

public class ProdutoEntrada extends Produto {
    public ProdutoEntrada(String nomeProduto, int quantidade) {
        super(nomeProduto, quantidade);
    }

    @Override
    public String getTipoProduto() {
        return "Entrada";
    }
}

