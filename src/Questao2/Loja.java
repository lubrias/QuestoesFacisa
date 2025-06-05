package Questao2;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        System.out.println("Produto: " + produto.getNome() + " adicionado com sucesso.");
    }

    public Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public boolean verificarProdutoEstoque(int codigo) {
        Produto produto = buscarProduto(codigo);
        if (produto != null && produto.getQuantidadeEstoque() > 0) {
            return true;
        }
        return false;
    }

    public boolean realizarVenda(int codigo, int quantidadeVendida) {
        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            if (produto.getQuantidadeEstoque() >= quantidadeVendida) {
                produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidadeVendida);
                System.out.println("Venda de " + quantidadeVendida + "unidades de ' " + produto.getNome() + "' realizada. Estoque atual: " + produto.getQuantidadeEstoque());
                return true;
            } else {
                System.out.println("Estoque insuficiente para '" + produto.getNome() + "' Disponível: " + produto.getQuantidadeEstoque());
                return false;
            }
        } else {
            System.out.println("Produto com código " + codigo + "não encontrado.");
            return false;
        }
    }


    public void exibirProdutos(int limiteEstoque) {
        System.out.println("\n--- Produtos com estoque abaixo de "+ limiteEstoque + " Unidades ---");
        boolean encontrado = false;
        for (Produto produto: produtos) {
            if (produto.getQuantidadeEstoque() < limiteEstoque) {
                System.out.println(produto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum produto com estoque abaixo de "+limiteEstoque + "unidades.");
        }
        System.out.println("------------------");
    }

    public void exibirTodosProdutos() {
        System.out.println("Todos os produtos da loja: ");
        if (produtos.isEmpty()) {
            System.out.println("A loja não possui produtos cadastrados.");
            return;
        }
        for (Produto produto: produtos) {
            System.out.println(produto);
        }
        System.out.println("---------------------");
    }
}
