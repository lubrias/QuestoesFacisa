package Questao2;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja();

        Produto p1 = new Produto(12,"Celular",1200.00,10);
        Produto p2 = new Produto(102, "Fone de ouvido",1500.00,5);
        Produto p3 = new Produto(10,"Camisa Térmica",130.50,4);


        minhaLoja.adicionarProduto(p1);
        minhaLoja.adicionarProduto(p2);
        minhaLoja.adicionarProduto(p3);

        Produto produtoBuscado = minhaLoja.buscarProduto(102);
        if (produtoBuscado != null) {
            System.out.println("Produto encontrado: "+produtoBuscado.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }
        System.out.println("Verificando estoque:");
        System.out.println("Há celular em estoque (cód 12) ?");
        if (minhaLoja.verificarProdutoEstoque(12) == true) {
            System.out.println("Existe sim! 10 celulares");
        } else {
            System.out.println("não");
        }


        System.out.println("Tentando vender: ");

        minhaLoja.realizarVenda(102,2);
        minhaLoja.realizarVenda(12,11);

        minhaLoja.exibirProdutos(10);


        minhaLoja.exibirTodosProdutos();
        }
    }
