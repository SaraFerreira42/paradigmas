// InterfaceSupermercado.java
package Supermercado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.io.*;

    class InterfaceSupermercado extends JFrame {

    private JTextField nomeProdutoField;
    private JTextField quantidadeField;
    private JTextArea outputArea;

    private ArrayList<EstoqueProduto> estoqueProdutos = new ArrayList<>();

    private JTable tabelaEstoque;
    private DefaultTableModel tabelaModel;

    public InterfaceSupermercado() {
        super("Sistema de Estoque - Supermercado");

        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // entrada
        JPanel painelEntrada = new JPanel(new GridLayout(4, 2));
        painelEntrada.add(new JLabel("Nome do Produto:"));
        nomeProdutoField = new JTextField();
        painelEntrada.add(nomeProdutoField);

        painelEntrada.add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        painelEntrada.add(quantidadeField);

        JButton botaoEntrada = new JButton("Registrar Entrada");
        JButton botaoSaida = new JButton("Registrar Saída");
        JButton botaoVerEstoque = new JButton("Ver Estoque");

        painelEntrada.add(botaoEntrada);
        painelEntrada.add(botaoSaida);
        painelEntrada.add(botaoVerEstoque);

        add(painelEntrada, BorderLayout.NORTH);

        // Área de saída
        outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        JScrollPane scrollOutput = new JScrollPane(outputArea);

        // Tabela de estoque
        tabelaModel = new DefaultTableModel(new Object[]{"Produto", "Quantidade", "Tipo"}, 0);
        tabelaEstoque = new JTable(tabelaModel);
        JScrollPane tabelaScrollPane = new JScrollPane(tabelaEstoque);

        // Painel central com saída + tabela
        JPanel painelCentro = new JPanel(new GridLayout(2, 1));
        painelCentro.add(scrollOutput);
        painelCentro.add(tabelaScrollPane);

        add(painelCentro, BorderLayout.CENTER);

        // Ações dos botões
        botaoEntrada.addActionListener(e -> registrarEntrada());
        botaoSaida.addActionListener(e -> registrarSaida());
        botaoVerEstoque.addActionListener(e -> atualizarTabela());

        setVisible(true);
    }

    private void registrarEntrada() {
        String nome = nomeProdutoField.getText().trim();
        int quantidade = Integer.parseInt(quantidadeField.getText());

        EstoqueProduto produto = buscarOuCriarProduto(nome);
        produto.quantidade += quantidade;

        outputArea.append("Entrada registrada: " + nome + " +" + quantidade + "\n");
        limparCampos();
    }

    private void registrarSaida() {
        String nome = nomeProdutoField.getText().trim();
        int quantidade = Integer.parseInt(quantidadeField.getText());

        EstoqueProduto produto = buscarOuCriarProduto(nome);

        if (produto.quantidade < quantidade) {
            outputArea.append("Erro: Estoque insuficiente para " + nome + "\n");
        } else {
            produto.quantidade -= quantidade;
            outputArea.append("Saída registrada: " + nome + " -" + quantidade + "\n");
        }

        limparCampos();
    }

    private EstoqueProduto buscarOuCriarProduto(String nome) {
        for (EstoqueProduto p : estoqueProdutos) {
            if (p.nomeProduto.equalsIgnoreCase(nome)) {
                return p;
            }
        }
        EstoqueProduto novo = new EstoqueProduto(nome, 0);
        estoqueProdutos.add(novo);
        return novo;
    }

    private void atualizarTabela() {
        tabelaModel.setRowCount(0); // limpa a tabela

        for (EstoqueProduto produto : estoqueProdutos) {
            tabelaModel.addRow(new Object[]{
                    produto.nomeProduto,
                    produto.quantidade,
                    produto.getTipoProduto()
            });
        }

        outputArea.append("Estoque atualizado na tabela.\n");
        salvarEmArquivo();
    }

    private void salvarEmArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("relatorio_estoque.txt"))) {
            for (EstoqueProduto produto : estoqueProdutos) {
                writer.write("Produto: " + produto.nomeProduto +
                        " | Quantidade: " + produto.quantidade +
                        " | Tipo: " + produto.getTipoProduto());
                writer.newLine();
            }
            outputArea.append("Estoque salvo em relatorio_estoque.txt\n");
        } catch (IOException e) {
            outputArea.append("Erro ao salvar no arquivo.\n");
        }
    }

    private void limparCampos() {
        nomeProdutoField.setText("");
        quantidadeField.setText("");
    }
}
