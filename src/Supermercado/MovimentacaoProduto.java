package Supermercado;

public class MovimentacaoProduto {

    void entrar (ProdutoEntrada entrada,int quantidade) {

    int quantAtual = entrada.quantEntrada;
    int novaQuant = quantAtual + quantidade;
    entrada.quantEntrada = novaQuant;

    }

    void sair(ProdutoSaida saida, EstoqueProduto estoque, int quantidade) {
        if (estoque.quantProduto < quantidade) {
            System.out.println("QUANTIDADE INSUFICIENTE DE PRODUTO PARA SAIR");
            System.out.println("QUANTIDADE DISPONÍVEL NO ESTOQUE: " + estoque.quantProduto);
        } else {
            estoque.quantProduto -= quantidade;
            saida.quantSaida += quantidade;
            System.out.println("SAÍDA REALIZADA. ESTOQUE ATUAL: " + estoque.quantProduto);
        }
    }


    void verificar(EstoqueProduto estoque, ProdutoEntrada entrada, ProdutoSaida saida) {
        int atualEstoque = entrada.quantEntrada - saida.quantSaida;
        estoque.quantProduto = atualEstoque;
        System.out.println("Estoque atualizado: " + atualEstoque);
    }


    }



