package Q6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("       MENU ESTOQUE");
            System.out.println("1)- Adicionar produto");
            System.out.println("2)- Verificar se produto está cadastrado");
            System.out.println("3)- Atualizar quantidade de produto");
            System.out.println("4)- Listar produtos com estoque zerado");
            System.out.println("5) - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();
                    estoque.adicionarProduto(new Produto(codigo, nome, qtd));
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    String codVerif = scanner.nextLine();
                    if (estoque.produtoCadastrado(codVerif)) {
                        System.out.println("Produto está cadastrado.");
                    } else {
                        System.out.println("Produto não cadastrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do produto: ");
                    String codAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQtd = scanner.nextInt();
                    scanner.nextLine();
                    estoque.atualizarQuantidade(codAtualizar, novaQtd);
                    break;

                case 4:
                    estoque.listarZerados();
                    break;

                case 5:
                    System.out.print("Digite o código do produto a remover: ");
                    String codRemover = scanner.nextLine();
                    estoque.removerProduto(codRemover);
                    break;

                case 0:
                    System.out.println("Saindo.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}


