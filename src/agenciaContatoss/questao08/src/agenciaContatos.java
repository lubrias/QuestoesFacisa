package agenciaContatoss;

import java.util.Scanner;

public class agenciaContatos {
    public static void main(String[] args) {
        agendaContatos agenda = new agendaContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu da Agenda de Contatos ===");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Atualizar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Verificar contato");
            System.out.println("5. Listar contatos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            // Verifica se a entrada é um número inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Escolha uma opção: ");
                scanner.next(); // Descarta a entrada inválida
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefoneAdicionar = scanner.nextLine();
                    agenda.adicionarContato(nomeAdicionar, telefoneAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite o novo telefone: ");
                    String telefoneAtualizar = scanner.nextLine();
                    agenda.atualizarContato(nomeAtualizar, telefoneAtualizar);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 4:
                    System.out.print("Digite o nome do contato a ser verificado: ");
                    String nomeVerificar = scanner.nextLine();
                    boolean existe = agenda.verificarContato(nomeVerificar);
                    if (existe) {
                        System.out.println("O contato \"" + nomeVerificar + "\" está na agenda.");
                    } else {
                        System.out.println("O contato \"" + nomeVerificar + "\" não foi encontrado na agenda.");
                    }
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
                case 6:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 6.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}


