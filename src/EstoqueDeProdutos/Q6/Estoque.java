package Q6;

import java.util.HashMap;

public class Estoque {
    private HashMap<String, Produto> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();

    }

    public boolean produtoCadastrado(String codigo) {
        return produtos.containsKey(codigo);

    }

    public void atualizarQuantidade(String codigo, int novaQuantidade) {
        Produto produto = produtos.get(codigo);
        if (produto != null) {
            produto.setQuantidade(novaQuantidade);
            System.out.println("Quantidade atualizada.");
        } else {
            System.out.println("Produto nao encontrado.");
        }
    }

    public void listarZerados() {
        System.out.println("Produtos com estoque zerado:");
        for (Produto p : produtos.values()) {
            if (p.getQuantidade() == 0) {
                System.out.println(p);
            }
        }
    }
    public void removerProduto(String codigo) {
        if(produtos.remove(codigo)!=null){
            System.out.println("Produto removido.");

        }else {
            System.out.println("Produto nao encontrado.");
        }
    }
    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getCodigo(), produto);
    }

}
