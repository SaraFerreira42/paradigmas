package Supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSupermercado {
    public static void main (String [] args){

        // entrada de produtos (nome e quantidade)
        Scanner scanner = new Scanner (System.in);
        ArrayList<ProdutoEntrada> entradas = new ArrayList<>();

        while (true) {
            Scanner sair = new Scanner(System.in);
            System.out.println("Digite [1] para começar e [0] para sair:");
            int sim = sair.nextInt();
            if (sim == 0){
                break;
            }
            Scanner nomeE = new Scanner(System.in);
            System.out.println("DIGITE O NOME DO PRODUTO QUE VAI ABASTECER: ");
            String produtoE = nomeE.next();
            Scanner quantE = new Scanner(System.in);
            System.out.println("DIGITE A QUANTIDADE DO PRODUTO: ");
            int numE = quantE.nextInt();

            ProdutoEntrada entrada = new ProdutoEntrada();
            entrada.entrada = produtoE;
            entrada.quantEntrada = numE;

            entradas.add(entrada);

        }
        System.out.println("\nProdutos cadastrados:");
        for (ProdutoEntrada p : entradas) {
            System.out.println("Produto: " + p.entrada + " | Quantidade: " + p.quantEntrada);
        }

        EstoqueProduto estoque = new EstoqueProduto();



        // saída de produto (nome e quantidade)

        //Scanner nomeS = new Scanner (System.in);
        //System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA RETIRAR: ");
        //String produtoS = nomeS.next();
        //Scanner quantS = new Scanner(System.in);
        //System.out.println("DIGITE A QUANTIDADE DO PRODUTO: ");
        //int numS = quantS.nextInt();
        //
















    }
}
