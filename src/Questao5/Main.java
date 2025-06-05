package Questao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gerenciamento gerenciamento = new Gerenciamento();
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {

            System.out.println("""
                    Bem vindo!
                    Opções:
                    1) Adicionar cliente
                    2) Verificar se um cliente está cadastrado
                    3) Remover cliente
                    4) Buscar cliente
                    5) Sair
                    Digite sua opção:                      
                    """);
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    // Adicionar cliente
                    gerenciamento.adicionarCliente();
                    break;
                case 2:
                    //Verificar se um cliente está cadastrado
                    gerenciamento.verificarCliente();
                    break;
                case 3:
                    // Remover cliente
                    gerenciamento.removerCliente();
                    break;
                case 4:
                    //Buscar cliente
                    gerenciamento.buscarCliente();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scan.close();
                    break;
            }
        }
    }
}
