// EstoqueProduto.java
package Supermercado;

public class EstoqueProduto extends Produto {
    public EstoqueProduto(String nomeProduto, int quantidade) {
        super(nomeProduto, quantidade);
    }

    @Override
    public String getTipoProduto() {
        return "Estoque";
    }
}

















