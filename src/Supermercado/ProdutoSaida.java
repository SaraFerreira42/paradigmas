// ProdutoSaida.java
package Supermercado;

public class ProdutoSaida extends Produto {
    public ProdutoSaida(String nomeProduto, int quantidade) {
        super(nomeProduto, quantidade);
    }

    @Override
    public String getTipoProduto() {
        return "Saída";
    }
}
